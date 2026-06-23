public class Substrings_of_Size_Three_with_Distinct_Characters_1876 {
    public static void main(String args[]){
        String s = "aababcabc";

        int left=0;
        int right=2;
        int count =0;

        while(right<s.length()){
             if(s.charAt(left)!=s.charAt(left+1) && s.charAt(left)!=s.charAt(right)){
                 count++;
             }
             left++;
             right++;
        }
        System.out.println(count);
    }
}
