import java.util.*;

public class Maximum_Walls_Destroyed_by_Robots_3661 {
    public static void main(String args[]){
        int []robots = {1,2};
        int []distance = {100,1};
        int []walls = {10};

        int r = robots.length;
        int count = 0;

        for(int i=0;i<r;i++){
            for(int j=0;j<r-i-1;j++){
                if(robots[j] > robots[j+1]){

                    int swap = robots[j];
                    robots[j] = robots[j+1];
                    robots[j+1] = swap;

                    int exchange = distance[j];
                    distance[j] = distance[j+1];
                    distance[j+1] = exchange;
                }
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : walls){
            set.add(num);
        }

        for(int i=0;i<r;i++){

            int flag = 0;

            int nextRobot = (i == r-1) ? Integer.MAX_VALUE : robots[i+1];
            int prevRobot = (i == 0) ? Integer.MIN_VALUE : robots[i-1];

            for (int j = robots[i] + 1; j <= robots[i] + distance[i] && j < nextRobot; j++) {
                if(set.contains(j)){
                    count++;
                    set.remove(j);
                    flag = 1;
                }
            }

            if(flag == 0){
                for (int k = robots[i] - 1; k >= robots[i] - distance[i] && k > prevRobot; k--) {
                    if(set.contains(k)){
                        count++;
                        set.remove(k);
                    }
                }
            }
        }

        System.out.println(count);
    }
}
