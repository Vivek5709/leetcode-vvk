public class Length_of_Last_Word_58 {
    public static void main(String[] args){
        String s = "luffy is still joyboy";

        String str =s.stripTrailing();
        int i=str.length()-1;
        for(i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
        }
        if(i<0){
            i=0;
        }
        System.out.println(str.substring(i,str.length()));
     //   System.out.println(str.substring(i,str.length()));
    }
}
