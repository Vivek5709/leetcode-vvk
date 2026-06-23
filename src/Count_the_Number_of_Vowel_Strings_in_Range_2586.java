public class Count_the_Number_of_Vowel_Strings_in_Range_2586 {
    public static void main(String[] args){
        String []words = {"are","amy","u"};
        int left = 0;
        int right = 2;

        int count =0;
        String vowels ="aeiou";

        for(int i=left;i<=right;i++){
            if(vowels.indexOf(words[i].charAt(0))!=-1 && vowels.indexOf(words[i].charAt(words[i].length()-1))!=-1){
                count++;
            }
        }

        System.out.println(count);
    }
}
