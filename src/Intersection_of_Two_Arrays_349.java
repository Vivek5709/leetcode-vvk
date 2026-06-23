import java.util.Arrays;

public class Intersection_of_Two_Arrays_349 {
    public static void main(String[] args) {

        int[] nums1 = {4,9,5,4};
        int[] nums2 = {9,4,9,8,4};

        int[] arr = new int[nums1.length + nums2.length];
        int pos = 0;

        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            // check if nums1[i] exists in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            // if common element found
            if (found) {

                boolean alreadyPresent = false;

                // check if already added
                for (int k = 0; k < pos; k++) {
                    if (arr[k] == nums1[i]) {
                        alreadyPresent = true;
                        break;
                    }
                }

                if (!alreadyPresent) {
                    arr[pos++] = nums1[i];
                }
            }
        }

        int[] result = Arrays.copyOf(arr, pos);
        System.out.println(Arrays.toString(result));
    }
}