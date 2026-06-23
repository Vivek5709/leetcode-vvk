import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {
    public static void main(String args[]){
        int []nums = {8,1,2,2,3};

        int []arr=new int[nums.length];
        for(int n=0;n< nums.length;n++){
            arr[n]=nums[n];
        }

        Arrays.sort(arr);
        int answer[] = new int[nums.length];
        int n=arr.length-1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<=n;i++){
            if(!map.containsKey(arr[i])){
                map.putIfAbsent(arr[i],i);
            }
        }

        for(int i=0;i<nums.length;i++) answer[i]=map.get(nums[i]);


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(answer));

    }
}
