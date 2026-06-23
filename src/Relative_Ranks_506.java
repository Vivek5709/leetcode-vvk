import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Relative_Ranks_506 {
    public static void main(String[] args){
        int []score = {5,4,3,2,1};

        String []arr = new String[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int k=0;

        for(int n:score){
            map.put(n,k);
            queue.add(n);
            k++;
        }

        int rank = score.length;
        while(!queue.isEmpty()){
            int index = map.get(queue.poll());
            arr[index] = Integer.toString(rank);
            if(rank==1)arr[index]="Gold Medal";
            if(rank==2)arr[index]="Silver Medal";
            if(rank==3)arr[index]="Bronze Medal";
            rank--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
