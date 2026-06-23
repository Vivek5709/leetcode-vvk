public class Reverse_Bits_190 {
    public static void main(String args[]){
        int n = 43261596;

        //System.out.println(Integer.toBinaryString(n));
        String binary="";
        for(int i=0;i<32;i++){
            binary=binary+(n&1);
            n>>=1;
        }
        //System.out.println(binary);
        System.out.println(Integer.parseInt(binary,2));
    }
}
