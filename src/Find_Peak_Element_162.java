public class Find_Peak_Element_162 {
    public static void main(String args[]){
        int []nums = {1,2,3,1};

        int left =0;
        int right = nums.length-1;
        int mid =0;

        if(nums[left]>nums[left+1]){
            System.out.println(left);
        }else if(nums[right]>nums[right-1]){
            System.out.println(right);
        }

        while(left<right) {
            mid = left + ((right - left) / 2);

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                break;
            }else if(nums[mid]<nums[mid+1]){
                left = mid +1;
            }else if(nums[mid]<nums[mid-1]){
                right= mid-1;
            }
        }

        System.out.println(mid);
    }
}
