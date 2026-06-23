import java.util.*;

public class Restore_Finishing_Order_3668 {
    public static void main(String[] args){
        int []order = {3,1,2,5,4};
        int []friends = {1,3,4};

        HashSet<Integer> set = new HashSet<>();
        for(int n:friends){
            set.add(n);
        }

        int j=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                friends[j] = order[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(friends));
    }
}
