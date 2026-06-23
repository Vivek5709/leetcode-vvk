import java.lang.*;

public class Find_the_K_Beuaty_of_a_Number_2269 {
    public static void main(String args[]){
        int num = 240;
        int k =2;

        String s = Integer.toString(num);
        int j=0;
        int count=0;

        while(k<=s.length()){
            if(Integer.valueOf(s.substring(j,k))!=0 && num%Integer.valueOf(s.substring(j,k))==0){
                count++;
            }
            j++;
            k++;
        }
        System.out.println(count);
    }
}
