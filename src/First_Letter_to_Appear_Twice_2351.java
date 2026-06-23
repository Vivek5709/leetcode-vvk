import java.util.HashMap;
import java.util.HashSet;

public class First_Letter_to_Appear_Twice_2351 {
    public static void main(String args[]){
        String s = "hthg";

        HashSet<Character> set=new HashSet<>();
        int i;
        for(i=0;i<s.length();i++){
            set.add(s.charAt(i));
            if(set.contains(s.charAt(i))){
                break;
            }
        }
        System.out.println(s.charAt(i));
    }
}
