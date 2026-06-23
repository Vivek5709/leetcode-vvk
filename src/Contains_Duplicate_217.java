import java.util.*;

public class Contains_Duplicate_217 {
    public static void main(String args[]){
        int []nums = {1,2,3,4};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i< nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }

        for(int j=0;j<nums.length;j++){
            if(set.contains(nums[j])){
                set.remove(nums[j]);
            }else{
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }
}
