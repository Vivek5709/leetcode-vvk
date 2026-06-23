import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Uncommon_Words_from_Two_Sentences_884 {
    public static void main(String []args){
        String s1 = "apple apple";
        String s2 = "banana";

        String []arr1 = s1.split(" ");
        String []arr2 = s2.split(" ");
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
        }

        for(String s:map1.keySet()){
            if(map1.get(s)==1 && !map2.containsKey(s)){
                list.add(s);
            }
        }
        for(String s:map2.keySet()){
            if(map2.get(s)==1 && !map1.containsKey(s)){
                list.add(s);
            }
        }

        String []arr = new String[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(arr1));
        System.out.println(s2.contains("sweet"));
    }
}
