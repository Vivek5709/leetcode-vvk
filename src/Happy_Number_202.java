import java.util.HashSet;

public class Happy_Number_202 {
    public static void main(String args[]){
        int n=2;

        HashSet<Integer> set=new HashSet<>();
        int d=0;
        int num=0;

        while(n>1){
            while(n>0){
                d=n%10;
                num=num+(d*d);
                n=n/10;
            }
            n=num;
            num=0;
            if(set.contains(n)){
                System.out.println(false);
                break;
            }
            set.add(n);
        }
        System.out.println(true);
    }
}
