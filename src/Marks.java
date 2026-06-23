import java.sql.SQLOutput;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of chemistry : ");
        float chemistry = sc.nextInt();
        System.out.print("Enter marks of maths : ");
        float maths = sc.nextInt();
        System.out.print("Enter marks of physics : ");
        float physics = sc.nextInt();

        int total = 90;

        float per = ((chemistry + physics + maths)/total) * 100;

        System.out.println(" your percentage is : " + per);

        // to check input value is of given type...
        boolean b1 = sc.hasNextByte();
        System.out.println(b1);
    }
}
