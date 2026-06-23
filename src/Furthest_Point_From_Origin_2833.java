public class Furthest_Point_From_Origin_2833 {
    public static void main(String args[]){
        String moves = "_______";

        int left =0;
        int right=0;
        int point=0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                point--;
                left++;
            }else if(moves.charAt(i)=='R'){
                point++;
                right++;
            }
        }
        int blank = moves.length()-(left+right);
        System.out.println((right>left)?(point+blank):-(point-blank));

    }
}
