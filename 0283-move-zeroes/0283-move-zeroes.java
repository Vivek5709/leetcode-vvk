class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        while(j < nums.length && nums[j] != 0){
    j++;
}

if(j == nums.length) return;

        for(int i = j+1;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}