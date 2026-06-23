public class Add_Digits_258 {
    public static int addDigits(int num) {
        int result = 0;
        int rem,div;

        while(num!=0){
            rem = num%10;
            //System.out.println(rem);
            result = result + rem;
            //System.out.println(result);
            num=num/10;
        }
           return (result>9)?addDigits(result):result;
    }

    public static void main(String []args){
        int num = 38;

        System.out.println(addDigits(num));


    }
}
