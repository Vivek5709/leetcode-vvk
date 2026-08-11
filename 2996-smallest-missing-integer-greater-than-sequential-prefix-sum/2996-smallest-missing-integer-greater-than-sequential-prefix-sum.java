class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int pSum = nums[0];

        for(int n : nums)set.add(n);

        for(int i = 1; i<nums.length; i++){
            if(nums[i - 1] == nums[i] - 1){
                pSum += nums[i];
            }else{
                break;
            }
        }

        while(set.contains(pSum)){
            pSum++;
        }

        return(pSum);
    }
}