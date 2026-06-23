public class Binary_Number_with_Alternating_Bits_693 {
    public static void main(String[] args){
        int num=5;

        int shift=num ^ num>>1;
        System.out.println((shift & (shift+1))==0);
    }
}
