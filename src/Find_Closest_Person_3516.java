public class Find_Closest_Person_3516 {
    public static void main(String args[]){
        int x = 2;
        int y = 7;
        int z = 4;

        if(Math.abs(x-z)>Math.abs(y-z)){
            System.out.println(2);
        } else if (Math.abs(x-z)<Math.abs(y-z)) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
