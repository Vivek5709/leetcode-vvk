import java.util.Arrays;

public class Decode_XORed_Array_1720 {
    public static void main(String args[]){
        int encoded[]={6,2,7,3};
        int first=4;

        int arr[]=new int[encoded.length+1];
        arr[0]=first;

        for(int i=1;i<arr.length;i++){
            arr[i]=first^encoded[i-1];
            first=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
