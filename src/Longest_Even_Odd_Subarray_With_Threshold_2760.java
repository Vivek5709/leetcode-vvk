public class Longest_Even_Odd_Subarray_With_Threshold_2760 {
    public static void main(String args[]){
        int []nums = {3,2,5,4};
        int threshold = 5;

        int left=0;
        int right=0;
        int max =0;

        while(left<nums.length){
            if(nums[left]%2==0 && nums[left]<=threshold){
                break;
            }
            left++;
        }

        //System.out.println(left);
        if(left==nums.length){
            System.out.println(0);
        }
        right=left;

        while(right<nums.length-1){
            if(nums[right]>threshold){
                max=Math.max(max,right-left);
                right++;
                left=right;
                while(left<nums.length && (nums[left]%2!=0 || nums[left]>threshold)){
                    left++;
                }
                right=left;
                continue;
            }
            if(nums[right]%2!=nums[right+1]%2 && nums[right+1]<=threshold){
                max=Math.max(max,right-left+1);
                right++;
            }else{
                max = Math.max(max, right - left + 1);
                right++;
                left=right;
                while(left<nums.length && (nums[left]%2!=0 || nums[left]>threshold)){
                    left++;
                }
                right=left;
            }
        }
        max = Math.max(max, right - left + 1);
        System.out.println(max);

    }
}
