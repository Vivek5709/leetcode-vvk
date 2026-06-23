import java.util.Arrays;

public class Distribute_Candies_575 {
    public static void main(String []args){
        int candyType[] = {100000,0,100000,0,100000,0,100000,0,100000,0,100000,0};

        int p1 =0;
        int p2 =1;
        int count =1;

        Arrays.sort(candyType);

        while(p2<=candyType.length-1){
            if(candyType[p1]==candyType[p2]){
                p2++;
            }else{
                p1 = p2;
                count++;
                p2++;
            }
        }
        int advice = candyType.length/2;
        if(count<=advice){
            System.out.println(count);
        }else{
            System.out.println(advice);
        }
    }
}
