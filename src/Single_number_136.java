import java.util.*;

public class Single_number_136 {
    public static void main(String []args){
        int []nums = {2,2,1};

        Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i=i+2){
            if(i==nums.length-1){
                System.out.println(nums[i]);
                break;
            }else if(nums[i]!=nums[i+1]){
                System.out.println(nums[i]);
                break;
            }
        }

    }
}
