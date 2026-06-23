public class Water_Bottles_1518 {
    public static void main(String []args){
        int numBottles = 15;
        int numExchange = 4;

        int nb = numBottles;
        int ne = numExchange;
        int counter =numBottles;
        int Q,R,New;

        if(nb<ne){
            System.out.println(0);
        }else{
            while(nb>ne){
                Q=nb/ne;
                R=nb%ne;
                New = Q+R;
                nb = New;
                counter=counter + Q;
            }
        }
        System.out.println(counter);
    }
}
