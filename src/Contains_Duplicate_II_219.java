import java.util.*;

public class Contains_Duplicate_II_219 {
    public static void main(String args[]){
        int []nums = {1,2,3,1,2,3};
        int k=2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i]) && (i-map.get(nums[i]))<=k){
                System.out.println(true);
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        System.out.println(false);
    }
}
