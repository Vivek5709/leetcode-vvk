import java.util.HashMap;

public class Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value_2283 {
    public static void main(String[] args){
        String num ="030";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : num.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean flag = true;

        for(int i = 0; i < num.length(); i++) {
            char ch = (char)(i + '0');

            if(map.getOrDefault(ch, 0) != num.charAt(i) - '0') {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
