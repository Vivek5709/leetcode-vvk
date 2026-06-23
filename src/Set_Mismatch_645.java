import java.util.HashSet;

public class Set_Mismatch_645 {
    public static void main(String []args){
        int []nums = {1,2,4,4};

        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        int duplicate = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                duplicate = nums[i];
            }else{
                set.add(nums[i]);
                sum+=nums[i];
            }
        }

        sum = ((nums.length*(nums.length+1))/2) - sum;

//        System.out.println(max);
        System.out.println(sum);
        System.out.println(duplicate);
    }
}
