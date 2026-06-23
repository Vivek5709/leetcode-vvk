import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Count_Pairs_Of_Similar_Strings_2506 {
    public static void main(String[] args){
        String []words = {"nba","cba","dba"};

        for(int i=0;i<words.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<words[i].length();j++){
                set.add(words[i].charAt(j));
            }

            char []arr = new char[set.size()];
            int k =0;
            for(char c:set){
                arr[k] = c;
                k++;
            }

            Arrays.sort(arr);

            words[i] = new String(arr);
        }

        HashMap<String,Integer> map = new HashMap<>();
        for(String s:words)map.put(s,map.getOrDefault(s,0)+1);

        int count =0;
        for(int n:map.values()){
            if(n>1){
                count = count + ((n*(n-1))/2);
            }
        }

        System.out.println(count);
        System.out.println(Arrays.toString(words));
    }
}
