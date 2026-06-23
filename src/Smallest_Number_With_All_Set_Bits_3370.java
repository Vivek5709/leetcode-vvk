public class Smallest_Number_With_All_Set_Bits_3370 {
    public static void main(String args[]){
        //System.out.println(Integer.toBinaryString(7));
        //System.out.println(Integer.toBinaryString(8));
        //System.out.println(7&14);

        int n=5;
        while((n&(n+1))!=0){
            n++;
        }
        System.out.println(n);
    }
}
