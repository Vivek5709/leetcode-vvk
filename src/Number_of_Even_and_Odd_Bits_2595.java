public class Number_of_Even_and_Odd_Bits_2595 {
    public static void main(String args[]){
        int n=50;

        int i=1;
        int odd=0;
        int even=0;
        while(n>0){
            if((n&1)==1){
                if(i%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            n>>=1;
            i++;
        }
        int arr[]={even,odd};
        System.out.println(even);
        System.out.println(odd);
    }
}
