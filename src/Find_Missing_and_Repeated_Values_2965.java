import java.util.HashSet;

public class Find_Missing_and_Repeated_Values_2965 {
    public  static  void main(String args[]){
        int [][]grid = {{9,1,7},{8,9,2},{3,4,6}};

        int duplicate = 0;
        int missing = 0;
        int n = grid.length * grid.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid.length;j++){
                if(set.contains(grid[i][j])){duplicate=grid[i][j];}
                set.add(grid[i][j]);
            }
        }

        int sum = n*(n+1)/2;
        int count =0;
        for(int k : set)count+=k;
        missing = sum - count;

        System.out.println(set);
        System.out.println(duplicate);
        System.out.println(missing);
    }
}
