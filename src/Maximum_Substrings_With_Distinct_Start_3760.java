import java.util.HashSet;

public class Maximum_Substrings_With_Distinct_Start_3760 {
    public static void main(String args[]){
        String s="aaaa";

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        System.out.println(set.size());
    }
}
