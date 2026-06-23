import java.util.TreeSet;

public class Q1_Smallest_Stable_Index_leetcode {
    public static void main(String args[]){
        int nums[]={5,0,1,4};
        int k=3;

        TreeSet<Integer> set_left = new TreeSet<>();
        TreeSet<Integer> set_right = new TreeSet<>();

        for(int j=0;j<nums.length;j++){
            set_right.add(nums[j]);
        }
        int i=0;
        int diff =0;
        int left=0;
        int right=0;
        for(i=0;i<nums.length;i++){
            set_left.add(nums[i]);
            if(i==nums.length-1){
                diff=Math.abs(left-right);
            }else {
                left = set_left.last();
                right = set_right.first();
                diff = Math.abs(left - right);
                set_right.remove(nums[i]);
            }
            if(diff<=k){
                System.out.println(diff);
                break;
            }else if(i==nums.length-1){
                System.out.println(-1);
                break;
            }
        }
        System.out.println(i);
    }
}
