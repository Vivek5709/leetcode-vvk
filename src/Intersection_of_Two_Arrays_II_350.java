import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_Two_Arrays_II_350 {
    public static void main(String[] args){
        int []nums2 = {4,9,5};
        int []nums1 = {9,4,9,8,4};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();

        int p1=0;
        int p2=0;

        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                p1++;
            }else if(nums2[p2]<nums1[p1]){
                p2++;
            }else{
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int i=0;
        int arr[]=new int[list.size()];
        while(i<list.size()){
            arr[i]=list.get(i);
            i++;
        }
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
}
