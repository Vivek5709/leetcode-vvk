import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Final_Array_State_After_K_Multiplication_Operations_I_3264 {
    public static void main(String args[]){
        int []nums = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int n:nums)queue.add(n);
        for(int i=0;i<k;i++){
            int n = queue.poll();
            for(int j=0;j< nums.length;j++){
                if(nums[j]==n){
                    nums[j] *= multiplier;
                    break;
                }
            }
            queue.add(n*multiplier);
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(queue);
    }
}
