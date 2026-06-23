public class XOR_Operation_in_an_Array_1486 {
    public static void main(String args[]){
        int n=4;
        int start=3;

        int xor=0;
        for(int i=0;i<n;i++){
            xor= xor^((i*2)+start);
        }
        System.out.println(xor);
    }
}
