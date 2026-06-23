import java.util.PriorityQueue;

public class Delete_Greatest_Value_in_Each_Row_2500 {
    public static void main(String args[]){
        int [][]grid = {{1,2,4},{3,3,1}};

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                queue.add(grid[i][j]);
            }
        }

        int sum =0;
        for(int i=0;i<grid[0].length;i++){
            sum+=queue.poll();
        }

        System.out.println(sum);
    }
}
