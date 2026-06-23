import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Separate_the_Digits_in_an_Array_2553 {
    public static void main(String[] args){
        int []nums = {13,25,83,77};

        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            if(n>9){
                int i=0;
                while(n>0){
                    int d=n%10;
                    i = (i*10)+d;
                    n/=10;
                }

                while(i>0){
                    int d = i%10;
                    list.add(d);
                    i/=10;
                }
            }else{
                list.add(n);
            }
        }

        int []arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
