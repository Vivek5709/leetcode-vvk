import java.util.Arrays;

public class Remove_Element_27 {
    public static void main(String []args){
        int []nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int p1 =0;
        int p2 = nums.length-1;

        while(p1<=p2){
            if(nums[p1]==val){
                int swap = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = swap;
                p2--;
            }else{
                p1++;
            }
        }
        System.out.println(p1);
        System.out.println(Arrays.toString(nums));

    }
}

