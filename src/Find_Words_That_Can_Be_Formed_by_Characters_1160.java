import java.util.Arrays;
import java.util.HashMap;

public class Find_Words_That_Can_Be_Formed_by_Characters_1160 {
    public static void main(String args[]){
        String []words = {"cat","bt","hat","tree"};
        String chars = "atach";

        int[] freq = new int[26];

        for(char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int total = 0;

        for(String word : words) {
            int[] temp = freq.clone();
            boolean possible = true;

            for(char c : word.toCharArray()) {
                if(temp[c - 'a'] == 0) {
                    possible = false;
                    break;
                }
                temp[c - 'a']--;
            }

            if(possible) {
                total += word.length();
            }
        }
        System.out.println(total);
    }
    }

