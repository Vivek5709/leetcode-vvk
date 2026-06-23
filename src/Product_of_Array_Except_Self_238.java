import java.util.Arrays;

public class Product_of_Array_Except_Self_238 {
    public static void main(String []args){
        int []nums={1,2,3,4};

        int arr[]=new int[nums.length];
        int pro = 1;

        for(int i=0;i<nums.length;i++){
             arr[i]=pro;
             pro=pro*nums[i];
        }

        pro=1;

        for(int j=nums.length-1;j>=0;j--){
            arr[j]=arr[j]*pro;
            pro=pro*nums[j];
        }

        System.out.println(Arrays.toString(arr));
    }
}
