import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Find_Missing_Elements_3731 {
    public static void main(String args[]){
        int []nums = {7,8,6,9};

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<=nums.length-1;i++)set.add(nums[i]);

        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
