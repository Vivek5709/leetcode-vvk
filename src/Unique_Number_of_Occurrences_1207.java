import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurrences_1207 {
    public static void main(String[] args){
        int nums[] = {-3,0,1,-3,1,1,1,-3,10,0};

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int n:nums)map.put(n,map.getOrDefault(n,0)+1);
        for(int k : map.keySet()){
            if(set.contains(map.get(k))){
                System.out.println(false);
            }
            set.add(map.get(k));
        }

        System.out.println(true);
    }
}
