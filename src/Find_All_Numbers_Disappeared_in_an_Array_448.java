import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {
    public static void main(String []args){
        int []nums = {1,1};

        int max =0;
        List<Integer> list = new ArrayList<>();
        for(int i:nums)max=Math.max(max,i);

        boolean arr[] = new boolean[nums.length+1];
        for(int n:nums){
            arr[n] = true;
        }

        for(int i=1;i< arr.length;i++){
            if(!arr[i]){
                list.add(i);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
