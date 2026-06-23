public class Max_Consecutive_Ones_485 {
    public static void main(String args[]){
        int []nums = {1,1,0,1,1,1};

        int max = 0;
        int count =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }

            if(count>max){
           // System.out.println(count);
                max = count;
            }

            if(nums[i]==0){
                count =0;
            }

        }

        System.out.println(max);

    }
}
