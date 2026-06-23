import java.util.Arrays;
import java.util.TreeSet;

public class Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores_1984 {
    public static void main(String args[]){
        int nums[]={9,4,1,7};
        int k=2;

        /**
        TreeSet<int[]> set =new TreeSet<>((a,b)->a[1]-b[1]);
        int left =0;
        int right=k-1;

        for(int i=left;i<k;i++){
            set.add(new int[]{i,nums[i]});
        }
        left++;
        right++;
        int diff = Integer.MAX_VALUE;


        while(right<nums.length){
            set.add(new int[]{right,nums[right]});
            set.remove(new int[]{left-1,nums[left]});

            int []min=set.first();
            int []max=set.last();
            diff=Math.min(diff,max[1]-min[1]);

            left++;
            right++;
        }

        System.out.println((diff==Integer.MAX_VALUE)?0:diff);
         **/
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0;i<=nums.length-k;i++){
             diff=Math.min(diff,nums[k+i-1]-nums[i]);
        }

        System.out.println(diff);
    }
}
