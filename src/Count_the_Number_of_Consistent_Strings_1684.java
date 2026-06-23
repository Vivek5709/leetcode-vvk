import java.util.HashSet;

public class Count_the_Number_of_Consistent_Strings_1684 {
    public static void main(String[] args){
        String allowed = "cad";
        String []words = {"cc","acd","b","ba","bac","bad","ac","d"};

        HashSet<Character> Allowed = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            Allowed.add(allowed.charAt(i));
        }

        int count=0;
        boolean flag = true;

        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char c= s.charAt(j);
                if(!Allowed.contains(c)){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                count++;
            }else{
                flag = true;
            }
        }
        System.out.println(count);
    }
}
