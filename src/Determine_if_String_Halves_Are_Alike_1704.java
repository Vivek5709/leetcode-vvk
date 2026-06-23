public class Determine_if_String_Halves_Are_Alike_1704 {
    public static void main(String []args){
        String s = "book";

        String vowels = "aeiouAEIOU";
        int count_left =0;
        int count_right =0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                if (i < s.length() / 2)
                    count_left++;
                else
                    count_right++;
            }
        }


        System.out.println(count_left);
        System.out.println(count_right);
        System.out.println((count_left==count_right));
    }
}
