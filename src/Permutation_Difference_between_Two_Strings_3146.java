import java.util.HashMap;

public class Permutation_Difference_between_Two_Strings_3146 {
    public static void main(String []args){
        String s = "abc";
        String t = "bac";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        int sum =0;
        for(int i=0;i<t.length();i++){
            sum+=Math.abs(i - map.get(t.charAt(i)));
        }

        System.out.println(sum);
    }
}
