import java.util.Scanner;

public class fibonacci_number_509 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int first = 0;
        int second = 1;
        int fib =0;

        for(int i=0;i<=num;i++){
            if(i==0){
                fib = 0;
            }else if(i==1){
                fib = fib + 1;
            }else {
                fib = first + second;

                first = second;
                second = fib;
            }
        }

        System.out.println(fib);
    }
}
