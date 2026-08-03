class Solution {
    public boolean check(int[] nums) {
        int ind = 0;

        if(nums[nums.length-1] > nums[0])ind++;
        for(int i =0;i<nums.length;i++){
            if(i > 0 && nums[i-1] > nums[i])ind++;
        }

        return(ind < 2);
    }
}