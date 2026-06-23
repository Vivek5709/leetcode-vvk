import java.util.HashMap;

public class Maximum_Number_of_Balloons_1189 {
    public static void main(String[] args){
        String text = "loonbalxballpoon";

        HashMap<Character,Integer> map = new HashMap<>();
        String t = "balloon";
        int instance = Integer.MAX_VALUE;

        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            if(t.indexOf(c)!=-1) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for(int n:map.values()){
            instance = Math.min(instance,n);
        }

        if(map.size()==t.length()-1){
            System.out.println(instance);
        }else{
            System.out.println(0);
        }

    }
}
