import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Sum_of_Distances_2615 {
    public static void main(String args[]){
        long []nums ={1,3,1,1,2};

        long arr[]=new long[nums.length];

       /** for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[i]==nums[j]){
                    arr[i] = arr[i] + Math.abs(i-j);
                }
            }
        }**/

       HashMap<Long, List<Integer>> map = new HashMap<>();

       for(int i=0;i<nums.length;i++){
           if(!map.containsKey(nums[i])){
               map.put(nums[i],new ArrayList<>());
               map.get(nums[i]).add(i);
           }else{
               map.get(nums[i]).add(i);
           }
       }

       for(int i=0;i<nums.length;i++){
           List<Integer> l=map.get(nums[i]);
           if(l.size()==1){
               arr[i]=0;
           }else{
               for(int j=0;j<l.size();j++){
                   if(i!=l.get(j)){
                       arr[i] = arr[i] + Math.abs(i-l.get(j));
                   }
               }
           }
       }

        System.out.println(map);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
    }
}
