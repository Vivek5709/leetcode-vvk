import java.util.HashSet;

public class Number_of_Substrings_Containing_All_Three_Characters_1358 {
    public static void main(String args[]){
        String s = "abcabc";

        HashSet<Character> set = new HashSet<>();
        int p1=0, p2 =0, count = 0;
        int len = s.length();

        while(p2<s.length()){
            set.add(s.charAt(p2));
            if(set.size()>2){
                count = count + (len - p2);
                p1++;
                p2=p1;
                set.remove('a');
                set.remove('b');
                set.remove('c');
            }
            p2++;
        }

        System.out.println(count);
        System.out.println(set);
        System.out.println(p1);
        System.out.println(p2);
    }
}
