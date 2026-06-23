public class Find_the_Highest_Altitude_1732 {
    public static void main(String args[]){
        int gain[] = {-5,1,5,0,-7};
        int sum =0;
        int MAX = 0;

        for(int i=0;i<gain.length;i++){
            sum =sum + gain[i];
            if(sum>MAX){
                MAX = sum;
            }
        }
        System.out.println(MAX);

    }
}
