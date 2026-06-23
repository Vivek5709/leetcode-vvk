public class Minimum_Operations_to_Make_Array_Sum_Divisible_by_K_3512 {
    public static void main(String args[]){
        int []nums = {4,1,3};
        int k = 4;

        int sum1 =0;
        for(int num:nums){
            sum1 = sum1 + num;
        }

        System.out.println(sum1%k);
    }
}
