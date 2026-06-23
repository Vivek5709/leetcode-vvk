public class Single_Element_in_a_Sorted_Array_540 {
    public static void main(String args[]){
        int []nums = {7,7,10,11,11,12,12};
        int len = nums.length;

        //System.out.println(nums.length);
        int left = 1;
        int right = nums.length-2;
        int mid =0;
        boolean flag1 = false;
        int flag =0;

        while(!flag1){
            mid = (left + right)/2;
            if(flag==1 && nums[mid-1]==nums[mid]){
                left = mid +1;
            }else if(flag==1 && nums[mid +1]==nums[mid]){
                right = mid -1;
            }

            if(nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid]){
                flag1 =true;
            }else if(mid%2==0 && flag==0){
                right = mid-1;
                flag=1;
            }else if(mid%2!=0 && flag==0){
                left = mid +1;
                flag=1;
            }
        }
        System.out.println(nums[mid]);
    }
}
