import java.util.Arrays;
import java.util.HashMap;

public class Merge_Two_2D_Arrays_by_Summing_Values_2570 {
    public static void main(String[] args){
        int [][]nums1 = {{1,2},{2,3},{4,5}};
        int [][]nums2 = {{1,4},{3,2},{4,1}};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i][0])){
                map.put(nums1[i][0],map.get(nums1[i][0])+nums1[i][1]);
            }else{
                map.put(nums1[i][0],nums1[i][1]);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }else{
                map.put(nums2[i][0],nums2[i][1]);
            }
        }

        int [][]a = new int[map.size()][2];
        int i =0;
        for(int n:map.keySet()){
            a[i][0] = n;
            a[i][1] = map.get(n);
            i++;
        }

        System.out.println(Arrays.deepToString(a));
        System.out.println(map);
    }
}
