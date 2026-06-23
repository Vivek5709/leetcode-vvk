import java.util.HashSet;

public class Check_if_the_Sentence_Is_Pangram_1832 {
    public static void main(String args[]){
        String sentence = "leetcode";

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        System.out.println(set.size()==26);
    }
}
