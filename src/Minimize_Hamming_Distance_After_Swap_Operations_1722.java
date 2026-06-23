import java.util.Arrays;

public class Minimize_Hamming_Distance_After_Swap_Operations_1722 {
    public static void main(String[] args){
        int []source = {5,1,2,4,3};
        int []target = {1,5,4,2,3};
        int [][]allowedSwaps = {{0,4},{4,2},{1,3},{1,4}};

        int k=0;
        int min=0;
        int n=source.length;

        Arrays.sort(allowedSwaps,(a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            if(source[i]!=target[i]){
                min++;
            }
            if(k < allowedSwaps.length && i==allowedSwaps[k][0]){
                min++;
                k++;
            }
        }
        System.out.println(min);
    }
}
