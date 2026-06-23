public class Matrix_Diagonal_Sum_1572 {
    public static void main(String []args){
        int [][]mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};

        int first = 0;
        int last = mat.length-1;
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(j==first || j==last){
                    sum+=mat[i][j];
                }
            }
            last--;
            first++;
        }

        System.out.println(sum);
    }
}
