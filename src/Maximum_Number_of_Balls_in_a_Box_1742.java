import java.util.HashMap;

public class Maximum_Number_of_Balls_in_a_Box_1742 {
    public static void main(String []args){
        int lowLimit = 19;
        int highLimit = 28;

        HashMap<Integer,Integer> map = new HashMap<>();
        int max =0;

        for(int i=lowLimit;i<=highLimit;i++){
            int num = i;
            int sum =0;
            while(num>0){
                int d = num%10;
                sum+=d;
                num/=10;
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
            max = Math.max(max,map.get(sum));
        }

        System.out.println(max);
    }
}
