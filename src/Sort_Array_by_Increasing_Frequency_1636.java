import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sort_Array_by_Increasing_Frequency_1636 {
    public static void main(String args[]){
        int []nums={1,1,2,2,2,3};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int arr[] = new int[map.size()];
        int i=0;
        for(int n : map.keySet()){
            arr[i] = map.get(n);
            i++;
        }

        Arrays.sort(arr);
        int j =0;
        int k=0;
        int number =0;
        while(j< nums.length){
            for(int n:map.keySet()){
                if(arr[k]==map.get(n)){
                    number = n;
                    k++;
                    break;
                }
            }
            int m =0;
            for(m=j;m<map.get(number);m++){
                nums[m] = number;
            }
                j=m;
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(map);
    }
}
