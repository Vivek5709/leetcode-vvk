import java.lang.String;
import java.util.*;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String []args){
        String s = "aab";

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int len =0;
        int j=0;

        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                len++;
            }else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    len--;
                    j++;
                }
                set.add(s.charAt(i));
                len++;
            }
            if(len>max){
                max = len;
            }
        }
        System.out.println(max);
    }
}
