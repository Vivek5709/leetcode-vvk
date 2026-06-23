public class Container_With_Most_Water_11 {
    public static void main(String[] args){
        int []height = {1,1};

        int left =0;
        int right =height.length-1;
        int max = 0;

        while(left<right){
            int min = Math.min(height[left],height[right]);
            int area = min * (height.length - left - (height.length-right));
            max = Math.max(max,area);
            if(min==height[left]){
                left++;
            }else{
                right--;
            }
        }

        System.out.println(max);
    }
}
