public class Bitwise_OR_of_Even_Numbers_in_an_Array_3688 {
    public static void main(String args[]){
        int []nums = {1,8,16};

        int or=0;
        for(int n:nums){
            if((n & 1)==0){
                or|=n;
            }
        }
        System.out.println(or);
    }
}
