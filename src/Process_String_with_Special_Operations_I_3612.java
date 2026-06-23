public class Process_String_with_Special_Operations_I_3612 {
    public static void main(String[] args){
        String  s = "a#b%*";

        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                ans+=ans;
                continue;
            }else if(s.charAt(i)=='%'){
                ans = new StringBuilder(ans).reverse().toString();
                continue;
            }else if(s.charAt(i)=='*'){
                ans = ans.substring(0,ans.length()-1);
                continue;
            }else {
                ans += s.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
