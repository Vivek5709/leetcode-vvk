import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_the_Difference_of_Two_Arrays_2215 {
    public static void main(String[] args){
        int []nums1 = {1,2,3,3};
        int []nums2 = {1,1,2,2};

        HashSet<Integer> nums_1 = new HashSet<>();
        HashSet<Integer> nums_2 = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int n:nums1)nums_1.add(n);
        for(int n:nums2)nums_2.add(n);

        List<Integer> l1 = new ArrayList<>();
        for(int n:nums1){
            if(!nums_2.contains(n)){
                l1.add(n);
            }
        }

        List<Integer> l2 = new ArrayList<>();
        for(int n:nums2){
            if(!nums_1.contains(n)){
                l2.add(n);
            }
        }

        list.add(l1);
        list.add(l2);

        System.out.println(list);
    }
}
