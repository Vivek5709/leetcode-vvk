import java.util.Arrays;

public class Minimum_Positive_Sum_Subarray_3364 {
    public static void main(String[] args){
        int []nums = {3, -2, 1, 4};
        int l = 2;
        int r = 3;
        int sum =0;

        int min = Integer.MAX_VALUE;
        int left=1;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }

        for(int i=0;i<nums.length;i++){
            int len = i-left+1;
            if(i==0) {
                sum = nums[i];
            }else{
                sum=nums[i]-nums[left-1];
            }

            while(len>r){
                //System.out.println("ok");
                if(i==0){
                    sum=nums[i];
                }else {
                    sum = nums[i] - nums[left - 1];
                }
                left++;
                len=i-left+1;
                min=Math.min(min,sum);
            }

            if(sum>0 && len>=l && len<=r){
                min=Math.min(min,sum);
            }
        }
        System.out.println(min);

        System.out.println(Arrays.toString(nums));
        System.out.println(min);
    }
}
