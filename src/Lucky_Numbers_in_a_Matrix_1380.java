import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix_1380 {
    public static void main(String[] args){
        int [][]matrix = {{3,7,8},{9,11,13},{15,16,17}};

        HashSet<Integer> col = new HashSet<>();
        HashSet<Integer> row = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int max_col = 0;
            int min_row = 100001;
            for(int j=0;j<matrix[0].length;j++){
                max_col = Math.max(max_col,matrix[j][i]);
                min_row = Math.min(min_row,matrix[i][j]);
            }
            col.add(max_col);
            row.add(min_row);
        }

        List<Integer> list = new ArrayList<>();
        for(int n:col){
            if(row.contains(n)){
                list.add(n);
            }
        }

        System.out.println(row);
        System.out.println(col);
        System.out.println(list);
    }
}
