public class Maximum_Product_of_Two_Elements_in_an_Array_1464 {
    public static void main(String args[]){
        int []nums = {3,7};
        int num1 = -1;
        int num2 =-1;

        for(int i=0;i<=nums.length-1;i++){
            if(i==0){
                num1 = nums[i];
            }else if(nums[i]>=num1){
                num2 = num1;
                num1 = nums[i];
            }else if(nums[i]>num2){
                num2 = nums[i];
            }else{
                continue;
            }
        }
        System.out.println(num1);
        System.out.println(num2);

        System.out.println((num1-1)*(num2-1));
    }
}
