import java.util.Arrays;

public class Reverse_String_344 {
    public static void main(String[] args){
        char []s={'h','e','l','l','o'};

        int left=0;
        int right=s.length-1;

        while(left!=right){
            char swap;
            swap=s[right];
            s[right]=s[left];
            s[left]=swap;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}
