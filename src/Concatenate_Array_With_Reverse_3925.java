import java.lang.reflect.Array;
import java.util.Arrays;

public class Concatenate_Array_With_Reverse_3925 {
    public static void main(String[] args){
        int []nums = {1,2,3};

        int []arr = new int[2*nums.length];
        int i=0;
        for(i=0;i<nums.length;i++)arr[i]=nums[i];
        for(int j = nums.length-1; j >=0; j--){
            arr[i]=nums[j];
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
