public class Split_a_String_in_Balanced_Strings_1221 {
    public static void main(String []args){
        String s = "RLRRRLLRLL";

        int count =0;
        int sum =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                sum++;
            }else{
                sum--;
            }

            if(sum==0)count++;
        }

        System.out.println(count);
    }
}
