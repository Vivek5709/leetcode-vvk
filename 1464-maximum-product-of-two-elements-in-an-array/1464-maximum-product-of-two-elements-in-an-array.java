class Solution {
    public int maxProduct(int[] nums) {
        
        int num1 = -1;
        int num2 =-1;

        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] > num1){
                num2 = num1;
                num1 = nums[i];
            }else if(nums[i] <= num1 && nums[i] >= num2){
                num2 = nums[i];
            }
        }
   

        return((num1-1)*(num2-1));   
    }
}