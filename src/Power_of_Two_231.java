public class Power_of_Two_231 {
    public static void main(String []args) {
        int n = 3;
        int num = n;
        int index = 0;
        int i=1;
        int rem=-1;

        while(rem>=0){
            rem=n%2;
            System.out.println(rem);
            if(rem!=0){
                System.out.println(i);
                index=1;
            }
            i=i/2;
        }

        System.out.println((index==1)?false:true);
    }
}
