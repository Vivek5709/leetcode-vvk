import java.util.HashMap;

public class Sum_of_Elements_With_Frequency_Divisible_by_K_3712 {
    public static void main(String[] args){
        int []nums = {4,4,4,1,2,3};
        int k = 3;

        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])%k==0){
                sum+=nums[i];
            }
        }

        System.out.println(sum);
        System.out.println(map);
    }
}
