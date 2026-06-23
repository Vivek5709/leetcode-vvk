public class Robot_Return_to_Origin_657 {
    public static void main(String []args){
        String moves = "LL";
        int x = 0;
        int y = 0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                y++;
            } else if (moves.charAt(i)=='D') {
                y--;
            }else if(moves.charAt(i)=='R'){
                x++;
            }else if(moves.charAt(i)=='L'){
                x--;
            }
        }

        if(y==0 && x==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
