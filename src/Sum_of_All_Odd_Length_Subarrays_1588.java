public class Sum_of_All_Odd_Length_Subarrays_1588 {
    public static void main(String args[]){
        int []arr = {1,4,2,5,3};
        int sum =0;
        int total_sum = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            arr[i]=sum;
        }

        for(int j=0;j<arr.length;j++){
            for(int k=j;k<arr.length;k=k+2){
                if(j==0){
                    total_sum=total_sum+arr[k];
                }else{
                    total_sum=total_sum+arr[k]-arr[j-1];
                }
            }
        }
        System.out.println(total_sum);
    }
}
