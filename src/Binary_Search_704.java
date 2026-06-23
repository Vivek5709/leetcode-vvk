public class Binary_Search_704 {
    public static void main(String args[]){
        int []nums = {-1,0,3,5,9,12};
        int target = 9;

        int left = 0;
        int right = nums.length-1;
        int mid =0;
        int k =0;
        int flag = 0;

        while(k<nums.length){
            if(nums[k]==target){
                flag = 1;
                k++;
            }
            else{
                k++;
                continue;
            }
        }

        if(flag!=1){
            System.out.println(false);
        }

        while(nums[mid]!=target){
            mid = (right + left)/2;

            if(target>nums[mid]){
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid - 1;
            }
        }
        System.out.println(true);
    }
}
