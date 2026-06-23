import java.util.Scanner;

public class pyramid_star_pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of layers : ");
        int layer = sc.nextInt();
        int star = 1;

        for(int i = 1;i<=layer;i++) {
            for (int j = 0; j <= layer - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            star = star + 2;
            System.out.println("");
             }
       }
}
