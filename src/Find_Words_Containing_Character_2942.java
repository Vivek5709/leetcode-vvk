import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character_2942 {
    public static void main(String[] args){
        String []words = {"abc","bcd","aaaa","cbc"};
        String x = "z";

        String str = String.valueOf(x);
        int i=0;
        List<Integer> list = new ArrayList<>();
        for(String s:words){
            if(s.contains(str)){
                list.add(i);
            }
            i++;
        }

        System.out.println(list);
    }
}
