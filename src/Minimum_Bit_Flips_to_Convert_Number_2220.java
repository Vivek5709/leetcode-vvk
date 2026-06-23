public class Minimum_Bit_Flips_to_Convert_Number_2220 {
    public static void main(String args[]){
        int start =10;
        int goal =7;

        /*
        String binary = Integer.toBinaryString(start^goal);
        int count =0;

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
        */

        int xor = start ^ goal;
        int count =0;

        while(xor>0){
            xor=xor &(xor-1);
            count++;
        }
        System.out.println(count);
    }
}
