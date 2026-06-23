public class Jump_Game_55 {
    public static void main(String []args){
        int []nums = {3,2,1,0,4};

        int left =0;
        while(left<nums.length-1){
            left+=nums[left];
            if(nums[left]==0)break;
        }

        System.out.println(left==nums.length-1);
    }
}
