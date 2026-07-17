class Solution {
    public void nextPermutation(int[] nums) {
        int temp = 0;
        int left = 0;
        int right = nums.length - 1;
        int pt = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pt = i;
                break;
            }
        }
        
        if(pt == -1){
            while(left < right){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        int nxtMax = nums[pt + 1];
        for(int i = nums.length -1; i > pt; i--){
            if(nums[i] > nums[pt] ){
                temp = nums[pt];
                nums[pt] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        left = pt + 1;
        right = nums.length - 1;
        while(left < right){
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left ++;
            right --;
        }
    }
}