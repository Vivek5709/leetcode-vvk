public class Left_and_Right_Sum_Differences_2574 {
    public static void main(String args[]){
        int nums[] = {1};
        int sum =0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }

        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];

        for(int j=0;j<nums.length;j++){
            if(j==0){
                leftSum[j] = 0;
                rightSum[j] = nums[nums.length-1] - nums[j];
            }else if(j==nums.length-1){
                leftSum[j] = nums[j-1];
                rightSum[j] = 0;
            }else{
                leftSum[j] = nums[j-1];
                rightSum[j] = nums[nums.length-1] - nums[j];
            }
        }

        for(int k=0;k<nums.length;k++){
            int diff =  rightSum[k]-leftSum[k];
            if(diff<0){
                diff = diff*(-1);
            }
            nums[k] = diff;
        }

        for(int k:nums){
            System.out.print(k + " ");
        }
    }
}
