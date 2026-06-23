import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_49 {
    public static void main(String args[]){
        String []strs = {""};

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for(String s:strs){
            char []arr = s.toCharArray();
            Arrays.sort(arr);
            String s1 = new String(arr);

            if(!map.containsKey(s1)){
                map.putIfAbsent(s1,new ArrayList<>());
            }
            map.get(s1).add(s);
            //System.out.println(s1);
        }

        for(List<String> l : map.values())list.add(l);

        System.out.println(list);
        System.out.println(map);
    }
}
