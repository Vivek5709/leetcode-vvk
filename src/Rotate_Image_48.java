import java.util.Arrays;

public class Rotate_Image_48 {
    public static void main(String args[]){
       int [][]matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
       int len = matrix.length;
       int [][]mx = new int [len][len];
       int k=0;

       int []arr = new int[len];

       for(int j=0;j<matrix.length;j++){
           for(int i=len-1;i>=0;i--){
              mx[j][k]=matrix[i][j];
              k++;
           }
           k=0;
       }

       for(int m=0;m<len;m++){
           matrix[m]=mx[m];
           System.out.println(Arrays.toString(matrix[m]));
       }




    }
}
