public class Search_nsert_Position_35 {
    public static void main(String args[]){
        int []nums = {1,2,3,4,5,6,8};
        int target = 7;

        int left = 0;
        int right = nums.length-1;
        int mid =0;

        while(left<=right){
            mid = (left + right)/2;
            if(nums[mid]==target){
                System.out.println(mid);
            }
            if(target>nums[mid]){
                left = mid + 1;
            }else if(target<nums[mid]){
                right = mid -1;
            }
        }
        if(nums.length%2==0){
            System.out.println(mid+1);
        }else{
        System.out.println(mid);
    }}
}
