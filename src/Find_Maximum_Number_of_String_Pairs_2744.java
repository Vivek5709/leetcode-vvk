import java.util.Arrays;
import java.util.HashSet;

public class Find_Maximum_Number_of_String_Pairs_2744 {
    public static void main(String args[]){
        String []words = {"aa","ab"};

        HashSet<String> set = new HashSet<>();
        int count =0;
        for(String s : words){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String s1 = new String(a);
            if(set.contains(s1)){
                count++;
            }
            set.add(s1);
        }

        System.out.println(count);
    }
}
