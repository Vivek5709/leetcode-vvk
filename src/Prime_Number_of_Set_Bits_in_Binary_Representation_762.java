public class Prime_Number_of_Set_Bits_in_Binary_Representation_762 {
    static int countBits(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        int left = 10;
        int right = 15;

        int count=0;
        String primes = "2,3,5,7,11,13,17,19,23";
        for(int i=left;i<=right;i++){
            int bit=countBits(i);
            if(primes.contains(Integer.toString(bit)) && bit!=9 && bit!=1){
                count++;
            }
        }
        System.out.println(count);
    }
}
