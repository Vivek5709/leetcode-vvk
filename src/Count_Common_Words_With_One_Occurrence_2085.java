import java.util.HashMap;

public class Count_Common_Words_With_One_Occurrence_2085 {
    public static void main(String[] args){
        String []words1 = {"leetcode","is","amazing","as","is"};
        String []words2 = {"amazing","leetcode","is"};

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        int count =0;

        for(String s:words1)map1.put(s,map1.getOrDefault(s,0)+1);
        for(String s:words2)map2.put(s,map2.getOrDefault(s,0)+1);

        for(String s: map1.keySet()){
            if(map1.get(s)==1 && map2.containsKey(s) && map2.get(s)==1){
                count++;
            }
        }

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(count);
    }
}
