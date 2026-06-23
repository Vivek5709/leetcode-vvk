import java.util.Arrays;

public class Add_to_Array_Form_of_Integer_989 {
    public static void main(String []args){
        int []num = {1,2,0,0};
        int k = 34;
        int n=0;

        for(int i=0;i<=(num.length-1);i++){
            n=(n*10)+num[i];
        }

        int sum=n+k;
        //System.out.println(sum);
        int len = (String.valueOf(sum)).length();

        int []arr=new int[len];
        int d;

        for(int j=len-1;j>=0;j--){
            d=sum%10;
            arr[j]=d;
            sum=sum/10;
        }

        System.out.println(Arrays.toString(arr));


    }
}
