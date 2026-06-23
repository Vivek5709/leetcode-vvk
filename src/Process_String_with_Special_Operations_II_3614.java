public class Process_String_with_Special_Operations_II_3614 {
    public static void main(String[] args){
        String s = "cd%#*#";
        int k = 3;

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='*'){
                if(sb.length()>0){
                    sb = sb.delete(sb.length()-1,sb.length());
                }
            }else if(c=='#'){
                sb = sb.append(sb);
            }else if(c=='%'){
                sb=sb.reverse();
            }else {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb);
        System.out.println(sb.charAt(k));
    }
}
