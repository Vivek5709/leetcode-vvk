class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            maxFreq = Math.max(maxFreq, map.get(nums[i]));

            while(maxFreq > k){
                if(map.get(nums[left]) == maxFreq)maxFreq--;
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, i - left + 1);
        }

        return(maxLen);
    }
}