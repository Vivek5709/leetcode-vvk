import java.util.Arrays;

public class Find_the_Degree_of_Each_Vertex_3898 {
    public static void main(String args[]){
        int [][]matrix = {{0}};

        int []ans = new int[matrix.length];
        for(int i =0;i< matrix.length;i++){
            int count = 0;
            for(int j=0;j<matrix.length;j++){
                count+=matrix[j][i];
            }
            ans[i] = count;
        }

        System.out.println(Arrays.toString(ans));
    }
}
