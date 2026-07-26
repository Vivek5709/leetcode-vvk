class Solution {
    public int maxProduct(int[] nums) {
        int preProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        int negCount = 0;

        for(int n:nums)if(n<0)negCount++;
        int count = negCount;

        for(int n : nums){
            preProduct *= n;
            maxProduct = Math.max(maxProduct,preProduct);

            if(n < 0)count--;

            if((preProduct < 0 && count==0) || preProduct==0){
                preProduct = 1;
            }
        }

        preProduct = 1;
        count = negCount;
        for(int i=nums.length-1;i>=0;i--){
            preProduct *= nums[i];
            maxProduct = Math.max(maxProduct,preProduct);

            if(nums[i] < 0)count--;

            if((preProduct < 0 && count==0) || preProduct==0){
                preProduct = 1;
            }
        }

        return (maxProduct);

    }
}