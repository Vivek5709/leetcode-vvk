import java.util.Arrays;
import java.util.HashSet;

public class Find_Common_Elements_Between_Two_Arrays_2956 {
    public static void main(String args[]){
        int []nums1 = {3,4,2,3};
        int []nums2 = {1,5};

        HashSet<Integer> Nums1 = new HashSet<>();
        HashSet<Integer> Nums2 = new HashSet<>();
        int answer1 =0;
        int answer2 =0;
        for(int i=0;i<nums1.length;i++)Nums1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++){
            Nums2.add(nums2[i]);
            if(Nums1.contains(nums2[i])){
                answer2++;
            }
        }

        for(int i=0;i<nums1.length;i++){
           if(Nums2.contains(nums1[i])){
               answer1++;
           }
        }

        System.out.println(Arrays.toString(new int[]{answer1,answer2}));
    }
}
