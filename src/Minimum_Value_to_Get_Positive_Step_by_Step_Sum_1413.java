public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum_1413 {
    public static void main(String[] args){
        int nums[] = {-3,2,-3,4,2};

        int sum =0;
        int min =0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(-(min-1));
    }
}
