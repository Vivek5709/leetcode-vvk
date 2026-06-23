public class Count_Partitions_with_Even_Sum_Difference_3432 {
    public static void main(String args[]){
        int nums[] = {2,4,6,8};

        int total = 0;
        for(int x : nums) total += x;

        int left = 0;
        int count = 0;

        for(int i = 0; i < nums.length-1; i++){
            left += nums[i];
            int right = total - left;

            if(Math.abs(left - right) % 2 == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
