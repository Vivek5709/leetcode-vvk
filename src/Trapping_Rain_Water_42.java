import java.util.Arrays;

public class Trapping_Rain_Water_42 {
    public static void main(String[] args){
        int []height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int []leftMax = new int[height.length];
        int []rightMax = new int[height.length];
        int max_left = height[0];
        int max_right = height[height.length-1];
        int count = 0;

        for(int i=0;i< height.length;i++){
            if(i==0){
                leftMax[0]=height[0];
            }else{
                max_left = Math.max(max_left,height[i]);
                leftMax[i] = max_left;
            }
        }

        for(int i=height.length-1;i>=0;i--){
            if(i==height.length-1){
                rightMax[height.length-1] = height[height.length-1];
            }else{
                max_right = Math.max(max_right,height[i]);
                rightMax[i] = max_right;
            }
        }

        for(int i=0;i<height.length;i++){
            int min = Math.min(leftMax[i],rightMax[i]);
            count+=Math.abs(min - height[i]);
        }

        System.out.println(count);
        System.out.println(Arrays.toString(rightMax));
        System.out.println(Arrays.toString(leftMax));
    }
}
