import java.util.Arrays;

public class Defuse_the_Bomb_1652 {
    public static void main(String[] args){
        int []code = {2,4,9,3};
        int k = -2;
        int n= code.length;
        int arr[]=new int[n];
        int sum=0;

        if(k==0){
            System.out.println(Arrays.toString(arr));
        }else if(k>0){
            int left=1;
            int right=k%n;
            for(int a=left;a<=right;a++){
               sum=sum+code[a];
            }
            arr[0]=sum;

            for(int i=1;i<n;i++){
                left=(left+1)%n;
                right=(right+1)%n;
                sum=sum+code[right]-code[(left-1+n)%n];
                arr[i]=sum;
            }
        }else{
            int right=n-1;
            int left=n+k;
            //System.out.println(right);
            for(int a=right;a>=left;a--){
                sum=sum+code[a];
            }
            arr[0]=sum;

            for(int i=1;i<n;i++){
                left=(left+1)%n;
                right=(right+1)%n;
                sum=sum+code[right]-code[(left-1+n)%n];
                arr[i]=sum;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
