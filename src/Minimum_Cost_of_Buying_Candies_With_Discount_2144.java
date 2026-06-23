import java.util.Arrays;

public class Minimum_Cost_of_Buying_Candies_With_Discount_2144 {
    public static void main(String[] args){
        int []cost = {1,2,3};

        int min_price = 0;
        int indicator = 1;
        Arrays.sort(cost);

        for(int i=cost.length-1;i>=0;i--){
            if(indicator==0){
                indicator=1;
                continue;
            }
            if(indicator>0){
                min_price += cost[i];
                indicator++;
            }
            if(indicator==3)indicator=0;
        }

        System.out.println(min_price);
        System.out.println(Arrays.toString(cost));
    }
}
