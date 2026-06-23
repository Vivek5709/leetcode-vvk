import java.util.*;
import java.lang.*;

public class Minimum_Window_Substring_76 {
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();

        int left =0;
        int right=0;
        map.put(t.charAt(0),1);

        for(int i=1;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),1);
                map1.put(t.charAt(i),0);
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
                map1.put(t.charAt(i),0);
            }
        }
        //System.out.println(map);
        for(int j=0;j<s.length();j++){

        }
    }
}
