public class Mirror_Distance_of_an_Integer_3783{
    public static void main(String[] args){
        int num =25;

        int n=num;
        int rev=0;
        while(n!=0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        System.out.println(Math.abs(rev-num));
    }
}
