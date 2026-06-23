public class Integer_to_Roman_12 {

    static int digitFinder(int num){
        int digit=1;
        while(num!=0){
            num=num/10;
            digit = digit*10;
        }
        return digit/10;
    }

    public static void main(String []args){

        int []num={1,5,10,50,100,500,1000};
        String []rom={"I","V","X","L","C","D","M"};

        int n = 3749;
        String ans="";

       int digit;
       int divider = 10;
       int i=0;

       while(n!=0){
           digit = n%divider;
           while(digit!=0){
               if(digit==9) {
                   ans = ans + "IX";
                   digit=0;
               }else if(digit==num[i]-1) {
                   ans = ans + rom[i - 1] + rom[i];
                   digit=0;
               }else if(digit==num[i]){
                       ans = ans + rom[i];
                       digit=0;
               }else{
                   ans = ans + rom[i-1];
                   digit=digit-num[i-1];
               }
               i++;
               }
           i=0;
           n=n/10;
           n=n*10;
           divider=divider*10;
       }
        System.out.println(ans);
       }

    }


