import java.util.Arrays;

public class Flipping_an_Image_832 {
    public static void main(String args[]){
        int [][]image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int arr[][]=new int[image.length][image[0].length];

        for(int i=0;i< image.length;i++){
            int k=image[0].length-1;
            for(int j=0;j<image[0].length;j++){
                arr[i][k]=(image[i][j]^1);
                k--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
