import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations_1441 {
    public static void main(String args[]){
        int []target = {1,2};
        int n = 4;

        List<String> list = new ArrayList<>();
        int index =0;
        for(int i=1;i<=n;i++){
            list.add("Push");
            if(target[index]!=i){
                list.add("Pop");
                continue;
            }
            index++;
            if(index>=target.length){
                break;
            }
        }

        System.out.println(list);
    }
}
