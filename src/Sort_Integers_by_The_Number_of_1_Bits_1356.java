import java.util.*;

public class Sort_Integers_by_The_Number_of_1_Bits_1356 {
    static int countBit(int n){
        int count=0;
        while(n>0){
            n=n & (n-1);
            count++;
        }
        return count;
    }


    public static void main(String args[]){
        int []arr = {1024,512,256,128,64,32,16,8,4,2,1};

        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(new int[]{countBit(arr[i]),arr[i]});
        }

        Collections.sort(list, (a, b) -> a[0] - b[0]);
        int a[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            a[i]=list.get(i)[1];
        }

        System.out.println(Arrays.toString(a));

    }
}
