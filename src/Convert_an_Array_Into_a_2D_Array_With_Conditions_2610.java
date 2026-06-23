import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions_2610 {
    public static void main(String args[]){
        int []nums = {1,2,3,4};

        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)map.put(n,map.getOrDefault(n,0)+1);
        while(map.size()>0){
            List<Integer> l = new ArrayList<>();
            for(int n : new ArrayList<>(map.keySet())){
                if(l.contains(n))break;
                l.add(n);
                map.put(n,map.get(n)-1);
                if(map.get(n)==0)map.remove(n);
            }
            list.add(l);
        }

        System.out.println(list);
    }
}
