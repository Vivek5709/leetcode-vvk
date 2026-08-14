class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i<nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];

                if(Math.abs(target - sum) < minDiff){
                    ans = sum;
                    minDiff = Math.abs(target - sum);
                }

                if(sum < target)left++;
                else if(sum > target)right--;
                else{
                    ans = sum;
                    break;
                }

            }
        }
        
        return ans;
    }
}