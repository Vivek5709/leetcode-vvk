public class Range_Sum_Query_Immutable_303 {

    public Range_Sum_Query_Immutable_303(int[] nums) {
        int sum =0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i]=sum;
        }
    }

    public int sumRange(int left, int right) {
         int sum=0;
         if(left==0){
             return right;
         }else{
           //  sum = nums[right]-nums[left-1];
         }

        return sum;
    }

    public static void main(String []args){

    }
}
