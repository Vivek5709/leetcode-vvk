class Spiral_Matrix_II_59{
    public static void main(String []args){
        int n = 4;
        int count =1;
        int arr[][] = new int[n][n];

        int end = 1;                                                   //   [  1   2   3  4 ]
        int last = n;                                                  //   [ 12  13  14  5 ]
        int i =0;                                                      //   [ 11  16  15  6 ]
        int j =0;                                                      //   [ 10   9   8  7 ]
        int start =0;
        int first = 0;

        while(count<=7){

            // Row from left to right
            for(i=start;i<last;i++){
                arr[start][i] = count;
                count++;
            }

            System.out.println(j);
            System.out.println(i);


            // Column from top to bottom
            for(int k=i;k<last;k++){
                arr[k][j]=count;
                count++;
            }



        }


        for(int v=0;v<n;v++){
            for(int s=0;s<n;s++){
                System.out.print(arr[v][s] + " ");
            }
            System.out.println(" ");
        }

    }
}