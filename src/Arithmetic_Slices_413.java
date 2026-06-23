public class Arithmetic_Slices_413 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int count = 0;
        int right = 1;
        int left=0;

        if(nums.length<3){
            System.out.println(0);
        }else {
            while (right < nums.length-1) {
                if(Math.abs(nums[right]-nums[right+1])==Math.abs(nums[left]-nums[right])){
                    right++;
                }else{
                    left=right+1;
                    right=left+1;
                }
                if(right-left+1>2){
                    count++;
                }
            }
            System.out.println(count);
        }


    }

}
