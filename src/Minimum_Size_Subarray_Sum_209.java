import java.util.Arrays;

public class Minimum_Size_Subarray_Sum_209 {
    public static void main(String args[]){
        int nums[]={2,3,1,2,4,3};
        int target = 7;


        int n= nums.length;
        int sum=0;
        int i=0;
        int min =n;

        for(int j=0;j<n;j++){
            sum=sum+nums[j];

            // Shrink window
            while(sum>=target){
                sum=sum-nums[i];
                // update answer
                if(min>(j-i)){
                    min=j-i;
                }
                i++;
            }

        }

        System.out.println(min+1);
    }
}
