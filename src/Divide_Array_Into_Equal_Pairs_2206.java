import java.util.Arrays;

public class Divide_Array_Into_Equal_Pairs_2206 {
    public static void main(String[] args){
        int []nums = {1,2,3,4};

        Arrays.sort(nums);
        if(nums.length%2!=0){
            System.out.println(false);
        }
        for(int i=0;i<nums.length;i+=2){
            if((nums[i]^nums[i+1])!=0){
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
