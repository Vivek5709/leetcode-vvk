import java.util.Arrays;

public class Construct_the_Minimum_Bitwise_Array_I_3314 {
    public static void main(String args[]){
         int []nums = {11,13,31};

         int arr[]=new int[nums.length];
         int j=0;
         while(j<nums.length){
             if(nums[j]%2!=0){
                 for(int i=0;i<nums[j];i++){
                     if((i|(i+1))==nums[j]){
                         arr[j]=i;
                         j++;
                         break;
                     }
                 }
             }else{
                 arr[j]=-1;
                 j++;
             }
         }
        System.out.println(Arrays.toString(arr));
    }
}
