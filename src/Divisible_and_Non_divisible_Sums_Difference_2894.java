public class Divisible_and_Non_divisible_Sums_Difference_2894 {
    public static void main(String args[]){
        int n=10;
        int m=3;

        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%m==0) sum+=i;
        }

        int k=Math.abs(((n*(n+1))/2)-(2*sum));
        System.out.println(k);
    }
}
