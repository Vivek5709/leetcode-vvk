public class Find_the_Pivot_Integer_2485 {
    public static void main(String args[]){
        int n=1;
        int total_sum=0;
        int sum =0;
        int prev_sum = 0;
        int j=0;

        for(int i=1;i<n+1;i++){
           total_sum = total_sum + i;
        }

        for(j=1;j<n+1;j++){
            sum = sum + j;
            if(sum==total_sum-prev_sum){
                break;
            }
            prev_sum=sum;
        }

        System.out.println(j);
    }
}
