import java.util.Arrays;

public class Counting_Bits_338 {
    static int countBit(int n){
        int count=0;
        while(n>0){
            n=n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        int n= 5;

        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=countBit(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
