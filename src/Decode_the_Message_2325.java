import java.util.HashMap;

public class Decode_the_Message_2325 {
    public static void main(String args[]){
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

        HashMap<Character,Character> map = new HashMap<>();
        char alpha = 'a';
        String mssg = "";

        for(int i=0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i)) && key.charAt(i)!=' '){
                map.put(key.charAt(i),alpha);
                alpha++;
            }
        }

        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                mssg+=' ';
                continue;
            }
            mssg+=map.get(message.charAt(i));
        }

        System.out.println(mssg);
    }
}
