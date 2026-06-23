import java.util.Scanner;

public class tables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number for table printing : ");
        int num = sc.nextInt();
        System.out.printf("\ntable for number %d : ",num);

        int i = 1;

        while(i<11){
            int j = num * i;
            System.out.format("%d * %d = %d\n",num,i,j);
            i++;
        }
    }
}
