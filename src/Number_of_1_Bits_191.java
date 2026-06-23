public class Number_of_1_Bits_191 {
    public static void main(String args[]){
        int n=2147483645;

        int count=0;
        while(n>0){
            n&=(n-1);
            count++;
        }
        System.out.println(count);
    }
}
