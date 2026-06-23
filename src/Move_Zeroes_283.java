public class Move_Zeroes_283 {
    public static void main(String args[]){
        int []nums = {0,1,0,3,12};
        int []arr = new int[nums.length];
        int j=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }

        for(int k=0;k<nums.length;k++){
            nums[k]=arr[k];
        }

        for(int l=0;l<nums.length;l++){
            System.out.println(nums[l]);
        }
    }
}
