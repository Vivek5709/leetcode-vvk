public class Find_Minimum_in_Rotated_Sorted_Array_153 {
    public static void main(String args[]){
        int []nums = {4,5,6,7,1,2};

        int left =0;
        int right = nums.length-1;
        int mid = 0;
        int MIN = nums[0];

        while(left<=right){
            mid = (left+right)/2;

            if(nums[right]<nums[mid]){
                left = mid +1;
            }else if(nums[right]>nums[mid]){
                right = mid -1;
            }else{
                left++;
            }

            if(nums[mid]<MIN){
                MIN = nums[mid];
            }
        }
            System.out.println(nums[mid]);
        System.out.println(MIN);

    }
}
