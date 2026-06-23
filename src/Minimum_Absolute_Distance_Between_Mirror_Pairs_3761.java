import java.util.HashMap;

public class Minimum_Absolute_Distance_Between_Mirror_Pairs_3761 {
    public static void main(String[] args) {
        int []nums = {21,120};
        int min =Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

      /**  for(int i=0;i<nums.length;i++){
            int d =0;
            int rev=0;
            int n=nums[i];

            while(n!=0){
                d=n%10;
                rev=(rev*10)+d;
                n=n/10;
            }

            if(map.containsKey(rev)){
                min=Math.min(min,i-(map.get(rev)));
            }
            map.put(nums[i],i);
        }**/

        for(int i = 0; i < nums.length; i++){

            int n = nums[i];
            int rev = 0;

            while(n != 0){
                rev = rev * 10 + n % 10;
                n /= 10;
            }

            if(map.containsKey(nums[i])){
                min = Math.min(min, i - map.get(nums[i]));
            }

            map.put(rev, i);
        }
        System.out.println(map);
        System.out.println((min==Integer.MAX_VALUE)?-1:min);
    }
}
