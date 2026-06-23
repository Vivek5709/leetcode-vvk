public class Hamming_Distance_461 {
    public static void main(String args[]){
        int x = 3;
        int y = 1;

        int count=0;
        while(x>0 || y>0){
            if((x&1)!=(y&1)){
                count++;
            }
            x=x>>1;
            y=y>>1;
        }
        System.out.println(count);
    }
}
