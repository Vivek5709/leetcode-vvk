import java.util.HashMap;

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences_1941 {
    public static void main(String[] args){
        String s = "aaabb";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int frq = map.get(s.charAt(0));
        for(int n:map.values()){
            if(n!=frq){
                System.out.println(false);
            }
        }

        System.out.println(true);
    }
}
