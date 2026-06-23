public class Check_if_Strings_Can_be_Made_Equal_With_Operations_I_2839 {
    public static void main(String args[]){
        String s1 = "abcd";
        String s2 = "cdab";

        for(int i=0;i<4;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println(i);
            }
        }
    }
}
