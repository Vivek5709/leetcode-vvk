import java.util.HashSet;

public class Destination_City_1436 {
    public static void main(String[] args){
        String [][]paths = {{"B","C"},{"D","B"},{"C","A"}};

        HashSet<String> set = new HashSet<>();
        for(int i=0;i< paths.length;i++){
            set.add(paths[i][0]);
            set.add(paths[i][1]);
        }

        String ans = null;
        for(int i=0;i<paths.length;i++){
            set.remove(paths[i][0]);
        }

        System.out.println(set.iterator().next());
    }
}
