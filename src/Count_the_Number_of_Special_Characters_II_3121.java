import java.util.HashMap;
import java.util.HashSet;

public class Count_the_Number_of_Special_Characters_II_3121 {
    public static void main(String args[]){
        String word = "aaAbcBC";

        int count =0;
        HashSet<Character> set =new HashSet<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);

            if(Character.isLowerCase(c)){
                set.add(c);
            }else if(set.contains(Character.toLowerCase(c))){
                count++;
                set.remove(c);
            }

        }

        System.out.println(count);
    }
}
