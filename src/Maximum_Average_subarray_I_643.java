public class Maximum_Average_subarray_I_643 {
    public static void main(String args[]){
        int nums[]={5,6};
        int k=1;

        double SUM =0;
        int p1 = 0;
        int p2 = k-1;

        for(int i=0;i<k;i++){
            SUM = SUM + nums[i];
        }
        //System.out.println(SUM);
        double MAX = SUM/k;

        while(p2<nums.length-1){

            if(nums.length>1) {
                SUM = SUM - nums[p1] + nums[p2 + 1];
                p1++;
                p2++;
            }
            double avg = SUM/k;
            if(avg>MAX){
                MAX=avg;
            }
        }

        System.out.println(MAX);

    }
}
