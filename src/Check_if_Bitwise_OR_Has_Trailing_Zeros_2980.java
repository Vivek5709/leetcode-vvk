public class Check_if_Bitwise_OR_Has_Trailing_Zeros_2980 {
    public static void main(String args[]){
        int nums[]={1,3,5,7,9};

        int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==0){
                count++;
            }
            if(count==2){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }
}
