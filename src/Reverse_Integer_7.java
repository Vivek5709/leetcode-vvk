public class Reverse_Integer_7 {
    public static void main(String []args){
        int num = 1534236469;
        int rev=0;
        int d;
        while(num!=0){
            d = num%10;
            rev=(rev*10)+d;
            num = num/10;
        }

        System.out.println(rev);
    }
}
