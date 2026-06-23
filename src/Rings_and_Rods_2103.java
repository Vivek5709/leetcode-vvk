import java.util.ArrayList;
import java.util.List;

public class Rings_and_Rods_2103 {
    public static void main(String args[]){
        String rings = "B0R0G0R9R0B0G0";

        List<Character> red = new ArrayList<>();
        List<Character> blue = new ArrayList<>();
        List<Character> green = new ArrayList<>();

        for(int i=0;i<rings.length();i+=2){
            if(rings.charAt(i)=='R')red.add(rings.charAt(i+1));
            if(rings.charAt(i)=='B')blue.add(rings.charAt(i+1));
            if(rings.charAt(i)=='G')green.add(rings.charAt(i+1));
        }

        int count =0;
        for(int i=0;i<10;i++){
            String n = Integer.toString(i);
            if(red.contains(n.charAt(0)) && blue.contains(n.charAt(0)) && green.contains(n.charAt(0))){
                count++;
            }
        }

        System.out.println(count);
    }
}
