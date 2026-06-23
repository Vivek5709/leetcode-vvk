import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order_1389 {
    public static void main(String[] args){
        int []nums = {0,1,2,3,4};
        int []index = {0,1,2,2,1};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
}
