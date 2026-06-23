import java.util.Arrays;
import java.util.Vector;

public class Reverse_Words_in_a_String_III_557 {
    public static void main(String args[]){
        String s = "Let's take LeetCode contest";

      /**  String arr[] = s.split("");
        Vector<Integer> v=new Vector<>();

        for(int i=0;i<s.length();i++){
            if(i==0 || i==s.length()-1 || s.charAt(i)==' '){
                v.add(i);
            }
        }

        int left=0;
        int i=1;
        int right=v.get(i)-1;

        while(right<v.size()){
            while(left<right){
                String swap = arr[left];
                arr[left]=arr[right];
                arr[right]=swap;

                right--;
                left++;
            }
            left=v.get(i)+1;
            right=v.get(i+1)-1;
            i++;
        }
        System.out.println(Arrays.toString(arr));
**/

        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                int left = start, right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                start = i + 1;
            }
        }
        System.out.println(Arrays.toString(arr));;
    }
}
