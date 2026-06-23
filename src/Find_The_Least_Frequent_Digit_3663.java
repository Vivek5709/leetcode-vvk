import java.util.HashMap;

public class Find_The_Least_Frequent_Digit_3663 {
    public static void main(String args[]){
        int n = 1553322;

        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int num =0;

        while(n>0){
            int d = n%10;
            map.put(d,map.getOrDefault(d,0)+1);
            n/=10;
        }

        for(int k:map.keySet()){
            if(min>map.get(k)){
                min = map.get(k);
                num = k;
            }
        }

        System.out.println(num);
    }
}
