class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
int len = nums.length;
boolean nonZero = false;

if(nums.length == 1 && nums[0] == 0)return 0;

for (int n : nums) {
    xor ^= n;

    if (n != 0) {
        nonZero = true;
    }
}

if (xor == 0 && nonZero) {
    len--;
}

if(len == nums.length && !nonZero) return 0;
return(len);
    }
}