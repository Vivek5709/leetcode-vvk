import java.util.HashMap;

public class Digit_Frequency_Score_3945 {
    public static void main(String args[]){
        int n = 122;

        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int d = n%10;
            map.put(d,map.getOrDefault(d,0)+1);
            n/=10;
        }

        int ans = 0;
        for(int num : map.keySet()){
            ans+=(num * map.get(num));
        }

        System.out.println(map);
        System.out.println(ans);
    }
}
