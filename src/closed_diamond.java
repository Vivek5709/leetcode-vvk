import java.util.Scanner;

class closed_diamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers (only odd) : ");
        int layer = sc.nextInt();


        int star=1;
        int change = layer-2;
        int mid=(layer/2)+1;
        int turn=0;
        int x=0;
        int mid_space = 0;

        for(int i =1;i<=layer;i++){

            //space printing

            if(i>mid){
                 //x = 1;
                turn=change-(mid_space+1);
            }else if(i<=mid){
                 //x = 0;
                turn=layer-i-1;
            }
            for(int j=1;j<=turn;j++){
                System.out.print(" ");
            }

           // star printing

           for(int k=1;k<=star;k++){
               System.out.print("*");
           }
           if(i<mid){
               star = star +2;
           }else{
               star = star-2;
           }
            System.out.println("");
        }

    }
}