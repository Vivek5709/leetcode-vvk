import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;

public class Find_Most_Frequent_Vowel_and_Consonant_3541 {
    public static void main(String []args){
        String s = "aeiaeia";

        HashMap<Character,Integer> vowels = new HashMap<>();
        HashMap<Character,Integer> consonants = new HashMap<>();
        String v = "aeiou";
        int max_vowel =0;
        int max_con =0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(v.indexOf(c)==-1){
                if(consonants.containsKey(c)){
                    consonants.put(c,consonants.get(c)+1);
                    max_con = Math.max(max_con,consonants.get(c));
                }else{
                    consonants.put(c,1);
                    max_con = Math.max(max_con,consonants.get(c));
                }
            }else{
                if(vowels.containsKey(c)){
                    vowels.put(c,vowels.get(c)+1);
                    max_vowel = Math.max(max_vowel,vowels.get(c));
                }else{
                    vowels.put(c,1);
                    max_vowel = Math.max(max_vowel,vowels.get(c));
                }
            }
        }
        System.out.println(max_con + max_vowel);
    }
}
