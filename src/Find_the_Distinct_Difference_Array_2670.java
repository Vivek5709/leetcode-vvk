import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Find_the_Distinct_Difference_Array_2670 {
    public static void main(String[] args){
        int []nums = {1,2,3,4,5};

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            HashSet<Integer> left = new HashSet<>();
            HashSet<Integer> right = new HashSet<>();

            for(int j = 0; j <= i; j++) {
                left.add(nums[j]);
            }

            for(int j = i + 1; j < nums.length; j++) {
                right.add(nums[j]);
            }

            ans[i] = left.size() - right.size();
        }


        System.out.println(Arrays.toString(ans));
    }
}
