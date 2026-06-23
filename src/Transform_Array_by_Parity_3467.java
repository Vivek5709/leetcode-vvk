import java.util.Arrays;

public class Transform_Array_by_Parity_3467 {
    public static void main(String[] args){
        int []nums = {1,5,1,4,2};

        int p1 =0;
        int p2=nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }

        while(p1<p2){
            if(nums[p1]==1){
                int temp = nums[p2];
                nums[p2]=nums[p1];
                nums[p1]=temp;
                p2--;
            }else{
                p1++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
