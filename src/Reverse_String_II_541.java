import java.util.Arrays;

public class Reverse_String_II_541 {
    public static void main(String args[]){
        String s = "abcd";
        int k = 2;

        int left=0;
        int right=k-1;
        String[] arr = s.split("");

        if(s.length()<k){
            right=arr.length-1;
            while(left<right){
                String swap = arr[left];
                arr[left]=arr[right];
                arr[right]=swap;

                right--;
                left++;
            }
        }else {
            while (right < s.length()) {
                while (left < right) {
                    String swap = arr[left];
                    arr[left] = arr[right];
                    arr[right] = swap;

                    right--;
                    left++;
                }
                right += (k * 2) + 1;
                left = right - k + 1;
               // System.out.println(right);
               // System.out.println(left);
            }
        }
        System.out.println(String.join("", arr));

    }
}
