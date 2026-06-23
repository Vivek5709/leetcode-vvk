import java.util.HashMap;

public class Count_Elements_With_Maximum_Frequency_3005 {
public static void main(String args[]){
    int []nums = {1,2,3,4,5};

    HashMap<Integer,Integer> map = new HashMap<>();
    int max_freq = 0;
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
        max_freq = Math.max(max_freq,map.get(n));
    }

    int count =0;
    for(int n:map.keySet()){
        if(map.get(n)==max_freq){
            count+=map.get(n);
        }
    }

    System.out.println(count);
}
}
