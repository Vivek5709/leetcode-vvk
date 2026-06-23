import java.util.*;

public class Longest_Harmonious_Subsequence_594 {
    public static void main(String[] args){
        int []nums = {1,1,1,1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int max =0;
        int count=0;

        for(int j=0;j<nums.length;j++){
            if(map.containsKey(nums[j]+1)){
                count = map.get(nums[j]) + map.get(nums[j]+1);
            }
            if(count>max){
                max=count;
            }
        }

        System.out.println(max);
    }
}
