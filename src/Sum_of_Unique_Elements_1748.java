import java.util.HashMap;

public class Sum_of_Unique_Elements_1748 {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)map.put(n,map.getOrDefault(n,0)+1);

        int sum =0;
        for(int k : map.keySet()){
            if(map.get(k)==1)sum+=k;
        }

        System.out.println(sum);
    }
}
