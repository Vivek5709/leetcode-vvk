import java.util.Arrays;
import java.util.HashMap;

public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box_1769 {
    public static void main(String args[]){
        String boxes = "001011";

        char []box = boxes.toCharArray();
        int []arr = new int[boxes.length()];
        HashMap<Integer,Character> map = new HashMap<>();

        for(int i=0;i< box.length;i++){
            map.put(i,box[i]);
        }

        for(int i=0;i<box.length;i++){
            int count = 0;
            for(int n:map.keySet()){
                if(n!=i && map.get(n)=='1'){
                    count+=Math.abs(i-n);
                }
            }
            arr[i]=count;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(map);
    }
}
