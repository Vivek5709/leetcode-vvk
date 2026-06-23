import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Repeated_DNA_Sequences_187 {
    public static void main(String args[]){
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        int left =0;
        int right =9;
        HashSet<String> map = new HashSet<>();
        List<String> l = new ArrayList<>();

        while(right<=s.length()-1){
            if(map.contains(s.substring(left,right+1))){
                //map.put(s.substring(left,right),map.get(s.substring(left,right))+1);
                if(!(l.contains(s.substring(left,right+1)))){
                    l.add(s.substring(left,right+1));
                }
            }else{
                map.add(s.substring(left,right+1));
            }
            left++;
            right++;
        }

        System.out.println(map);
        System.out.println(l);
    }
}
