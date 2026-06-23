public class Set_Matrix_Zeroes_73 {

    public static void main(String args[]){
        int [][]matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int row = matrix.length;;
        int col = matrix[0].length;

        int[][] m = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<col;k++){
                        m[i][k]=0;
                    }
                    for(int l=0;l<row;l++){
                        m[l][j]=0;
                    }
                }
            }
        }

        for(int k=0;k<row;k++){
            for(int l=0;l<col;l++){
                matrix[k][l]=m[k][l];
            }
        }

    }
}
