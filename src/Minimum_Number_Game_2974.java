import java.util.Arrays;
import java.util.PriorityQueue;

public class Minimum_Number_Game_2974 {
    public static void main(String args[]){
        int []nums = {2,5};

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int n:nums)queue.add(n);
        int index =0;
        while(!queue.isEmpty()){
            int alice = queue.poll();
            int bob = queue.poll();
            nums[index] = bob;
            index++;
            nums[index] = alice;
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
