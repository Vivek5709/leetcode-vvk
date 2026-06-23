public class Two_Furthest_Houses_With_Different_Colors_2078 {
    public static void main(String args[]){
       int[] colors = {4,4,4,11,4,4,11,4,4,4,4,4};

       int left=0;
       int right=colors.length-1;

       while(colors[right]==colors[left]){
           right--;
       }

       int max=right-left;
       left=0;
       right=colors.length-1;

       while(colors[left]==colors[right]){
           left++;
       }

       max=Math.max(max,right-left);

       System.out.println(max);
    }
}
