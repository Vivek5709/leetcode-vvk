import java.util.*;

public class hashmap_java {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();

        // insertion op
        map.put("India",120);
        map.put("USA",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China",180);
        System.out.println(map);

        // Search
        if(map.containsKey("Italy")){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }

       // System.out.println(map.get("India"));
       // System.out.println(map.get("Japan"));

        // Iteration
        /*for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }*/

        Set<String> key = map.keySet();
        for(String k : key){
            System.out.println(k);
        }

        // Remove
        map.remove("USA");
        map.remove("Japan");
        System.out.println(map);
    }
}
