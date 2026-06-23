public class Climbing_Stairs_70 {
    public static void main(String []args){
        int n =2;
        int first = 0;
        int second = 1;
        int fib =0;

        for(int i=0;i<=n;i++){
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
