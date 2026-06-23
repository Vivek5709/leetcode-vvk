import java.util.HashMap;

public class Count_Largest_Group_1399 {
    public static void main(String args[]){
        int n = 2;

        HashMap<Integer,Integer> map = new HashMap<>();
        int max =0;

        for(int i=1;i<=n;i++){
            int num =i;
            int sum =0;
            while(num>0){
                int d = num%10;
                sum+=d;
                num/=10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            max = Math.max(max,map.get(sum));
        }

        int count =0;

        for(int k:map.values()){
            if(k==max){
                count++;
            }
        }

        System.out.println(count);
    }
}
