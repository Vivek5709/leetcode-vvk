import java.util.Arrays;

public class Removing_Stars_From_a_String_2390 {
    public static void main(String[] args){
        String s = "erase*****";

        char[] stack = new char[s.length()];
        int top = 0;
        String ans = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='*' && top>0){
                top--;
            }else{
                stack[top] = c;
                top++;
            }
        }

        for(int i=0;i<top;i++){
            ans+=stack[i];
        }

        System.out.println(ans);
        System.out.println(Arrays.toString(stack));
    }
}
