import java.util.Arrays;

public class Destroying_Asteroids_2126 {
    public static void main(String []args){
        int mass = 86;
        int []asteroids = {156,197,192,14,97,160,14,5};

        Arrays.sort(asteroids);

        for(int n:asteroids){
            if(n>mass){
                System.out.println(false);
                break;
            }else{
                mass+=n;
            }
        }
        System.out.println(true);
    }
}
