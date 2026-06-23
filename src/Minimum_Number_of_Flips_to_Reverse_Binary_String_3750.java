public class Minimum_Number_of_Flips_to_Reverse_Binary_String_3750 {
    public static void main(String args[]){
        //System.out.println(Integer.toBinaryString(10));
        int n=7;

        String str=Integer.toBinaryString(n);
        String reverse="";
        for(int i=0;i<str.length();i++){
            reverse=str.charAt(i) + reverse;
        }

        int count =0;
        int rev= Integer.parseInt(reverse, 2);
        int xor=n^rev;

        while(xor>0){
            xor&=(xor-1);
            count++;
        }
        System.out.println(count);

    }
}
