import java.util.HashMap;

public class Count_the_Number_of_Good_Subarrays_2537 {
    public static void main(String[] args){
        int []nums = {3,1,4,3,2,2,4};
        int k = 2;

        int count =0;
        int j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],1);

        for(int i=1;i<nums.length;i++){
            if(map.containsKey(nums[i])){

            }else{
                map.put(nums[i],1);
            }

            if(j>k){
                while(j>=k){
                    j--;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
