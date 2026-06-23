import java.util.HashMap;

public class Smallest_Pair_With_Different_Frequencies_3852 {
    public static void main(String[] args){
        int []nums = {1,1,2,2,3,4};

        int x =-1;
        int y =-1;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums)map.put(n,map.getOrDefault(n,0)+1);

        System.out.println(map);
    }
}
