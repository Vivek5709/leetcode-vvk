import java.util.HashMap;

public class Kth_Distinct_String_in_an_Array_2053 {
    public static void main(String[] args){
        String []arr = {"aaa","aa","a"};
        int k = 1;

        HashMap<String,Integer> map = new HashMap<>();
        for(String s:arr)map.put(s,map.getOrDefault(s,0)+1);

        String distinct = null;
        int kth = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                kth++;
                if(kth==k)distinct=arr[i];
            }
        }

        System.out.println(map);
        System.out.println((kth<k)?"":distinct);
    }
}
