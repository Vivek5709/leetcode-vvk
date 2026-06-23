import java.lang.String;

public class Valid_Palindrome_125 {
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        char alpha[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        String s1 = "";

        for(int i=0;i<s.length();i++){
            for(int j=0;j<alpha.length;j++){
                if(s.charAt(i)==alpha[j]){
                    s1=s1+s.charAt(i);
                }
            }
        }
        s1 =(s1.toLowerCase());
        String s2 = "";

        for(int k=0;k<s1.length();k++){
              s2=s1.charAt(k)+s2;
        }
        System.out.println(s2);
        System.out.println((s1.equals(s2))?true:false);
    }
}
