public class Search_in_Rotated_Sorted_Array_II_81 {
    public static void main(String args[]){
        int []nums = {2,5,6,1,2};
        int target = 0;

        int left =0;
        int right =0;
        int mid =0;

        int ptr1 =0;
        int ptr2 =0;

        // find the end points of two sorted parts of arrray
        int i=0;
        while(nums[i+1]>nums[i]){
            i++;
        }
        ptr2 = i;
        //System.out.println(i);

        if(nums[ptr1]<=target && target<=nums[ptr2]){
            right = ptr2;
        }else{
            left = ptr2+1;
            right = nums.length-1;
        }

        if(nums[right]==target || nums[left]==target){
            System.out.println(true);
        }

        System.out.println(left);
        System.out.println(right);

        // binary search
        while(left<=right){
            mid = (left + right)/2;
            if(target>nums[mid]){
                left = mid+1;
            }else{
                right=mid-1;
            }
        }

        if(nums[mid]==target){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
