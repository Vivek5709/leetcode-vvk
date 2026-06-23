public class Minimum_distance_to_target_element_1848 {
    public static void main(String args[]){

    int[] nums = {1,1,1,1,1,1,1,1,1,1};
    int target = 1;
    int start = 9;

    int min = nums.length;
    if(nums[start]==target){
        System.out.println(0);
    }
    for(int i=0;i<nums.length;i++){
        if(Math.abs(start-i)<min && nums[i]==target){
            min = i;
        }else if(i>start && Math.abs(start-i)<min){
            min=i;
            break;
        }else if(i>start && Math.abs(start-i)>min){
            break;
        }
    }
        System.out.println(Math.abs(start-min));
    }
}
