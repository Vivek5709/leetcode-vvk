import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Count_Pairs_Whose_Sum_is_Less_than_Target_2824 {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int target = -2;

        Collections.sort(nums);
        int p1 = 0;
        int p2 = nums.size()-1;
        int count = 0;
        while(p1<p2){
            if(nums.get(p1)+nums.get(p2)<target){
                count = count + (p2 - p1);
                p1++;
            }else{
                p2--;
            }
        }


        System.out.println(count);
        System.out.println(nums);
    }
}
