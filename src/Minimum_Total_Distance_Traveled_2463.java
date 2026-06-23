import java.util.*;

public class Minimum_Total_Distance_Traveled_2463 {
    public static void main(String[] args){

        List<Integer> robots = new ArrayList<>();
        robots.add(1);
        robots.add(-1);
       // robots.add(6);
        int [][]factory = {{-2,1},{2,1}};

        Collections.sort(robots);

        long count =0;
        int j=0;

        for(int i=0;i<robots.size();i++){
            long min = Long.MAX_VALUE;
            int index =-1;
            long prev_min =min;

             for(j=0;j< factory.length;j++){
                 if(factory[j][1]!=0){
                     prev_min=min;
                     min = Math.min(min, Math.abs(robots.get(i) - factory[j][0]));
                     if(prev_min!=min){
                         index = j;
                     }
                 }
             }
             count=count+min;
             factory[index][1]--;
        }
        System.out.println(count);
    }
}
