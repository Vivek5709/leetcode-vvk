import java.util.HashMap;

public class Find_Lucky_Integer_in_an_Array_v {
    public static void main(String[] args){
        int []arr = {1,2,2,3,3,3};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:arr)map.put(n,map.getOrDefault(n,0)+1);

        int max = 0;
        for(int k:map.keySet()){
            if(k==map.get(k)){
                max =Math.max(max,k);
            }
        }

        System.out.println(max);
    }
}
