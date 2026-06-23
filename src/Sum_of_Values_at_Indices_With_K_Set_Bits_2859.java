public class Sum_of_Values_at_Indices_With_K_Set_Bits_2859 {
    static int countBit(int num){
        int count =0;
        while(num>0){
            num=num & (num-1);
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        int []nums = {4,3,2,1};
        int k = 2;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(countBit(i)==k){
                sum+=nums[i];
            }
        }

        System.out.println(sum);
    }
}
