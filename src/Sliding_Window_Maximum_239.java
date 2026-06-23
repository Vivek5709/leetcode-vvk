import java.util.Arrays;

public class Sliding_Window_Maximum_239 {
    public static void main(String args[]){
        int []nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int left =0;
        int right =k-1;
        int max1 = 0;
        int max2=0;
        int []arr = new int[nums.length-k+1];
        int j =0;

        for(int i=left;i<k;i++){
            max1 =Math.max(max1,nums[i]);
        }

        while(right<=nums.length-1){
            max2=Math.max(max2,nums[left]);

            if(max2>max1){
                arr[j]=max1;
                max1=max2;
                j++;
            }

            if(left!=0 && nums[left]==max1){
                max1=max2;
                arr[j]=max1;
                j++;
            }

            right++;
            left++;
        }



        System.out.println(Arrays.toString(arr));
    }
}
