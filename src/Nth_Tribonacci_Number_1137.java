import java.util.Scanner;

public class Nth_Tribonacci_Number_1137 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=0;

        int first =0;
        int second = 1;
        int third = 1;
        int fib =0;

        for(i=0;i<=num;i++){
            if(i==0){
                fib=0;
            }else if(i==1){
                fib = fib + 1;
            }else if(i==2){
                fib = first + second;
            }else{
                fib = first + second + third;
                first = second;
                second = third;
                third = fib;
            }
        }
        System.out.println(fib);
    }
}
