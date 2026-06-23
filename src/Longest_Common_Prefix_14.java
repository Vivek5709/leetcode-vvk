import java.lang.String;

public class Longest_Common_Prefix_14 {
    public static void main(String args[]){
        String []strs = {"dog","racecar","car"};
        String sample = strs[0];

        for(int i=0;i<strs.length;i++){
            int len = strs[i].length();
            if(len<sample.length()){
                sample = strs[i];
            }
        }

        String s = "";
        int flag =0;
        Character s1 = 'f';

        for(int j=0;j<sample.length();j++){
            for(int k=0;k<strs.length;k++){
                if(sample.charAt(j)==strs[k].charAt(j)){
                    s1 = strs[k].charAt(j);
                    continue;
                }else{
                    flag = 1;
                    break;
                }
            }
            if(flag!=1){
                s = s + s1;
            }
        }
        System.out.println(s);
    }
}
