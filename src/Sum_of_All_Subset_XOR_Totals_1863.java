public class Sum_of_All_Subset_XOR_Totals_1863 {
    int index =0;
    int sum =0;

    public int subsetXORSum(int[] nums) {
        int xor=nums[0];

        if(index==nums.length-1){
            for(int i:nums){
                sum+=i;
                xor=xor^i;
            }
            System.out.println("oky");
            sum+=xor;
            return sum;
        }else{
            System.out.println("oky2");
            for(int i=index+1;i<nums.length;i++){
                sum+=(nums[index]^nums[i]);
            }
            index++;
            subsetXORSum(nums);
        }
        return 0;
    }

    public static void main(String []args){
        int nums[]={5,1,6};
        Sum_of_All_Subset_XOR_Totals_1863 s1 = new Sum_of_All_Subset_XOR_Totals_1863();
        System.out.println(s1.subsetXORSum(nums));
    }
}
