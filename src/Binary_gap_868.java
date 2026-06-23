import java.util.ArrayList;
import java.util.List;

public class Binary_gap_868 {
    public static void main(String[] args){
        int n=22;

        int max = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            if (list.isEmpty() && (n & 1) == 1) {
                list.add(1);
                n = n >> 1;
                continue;
            }
            if ((n & 1) == 1) {
                count++;
                max = Math.max(max, count);
                count = 0;
            } else if (!(list.isEmpty())) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(max);
    }
}
