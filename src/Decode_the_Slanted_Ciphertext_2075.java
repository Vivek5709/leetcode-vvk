public class Decode_the_Slanted_Ciphertext_2075 {
    public static void main(String args[]){
        String encodedText = "iveo    eed   l te   olc";
        int rows = 4;
        int col = encodedText.length()/rows;
        String str = "";
        int size = encodedText.length();

        for(int i=0;i<col;i++){
            for(int j=i;j<size;j=j+col+1){
                str = str + encodedText.charAt(j);
            }
        }
        System.out.println( str.stripTrailing());
    }
}
