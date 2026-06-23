import java.util.Arrays;

public class Maximum_Strong_Pair_XOR_I_2932 {
    public static void main(String args[]){
        int []nums={1,2,3,4,5};

        Arrays.sort(nums);

        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(nums[j] > 2 * nums[i]) {
                    break;
                }
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        System.out.println(max);
    }
}
