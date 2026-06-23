public class Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529 {
    public static void main(String[] args){
        int []nums = {-2,-1,-1,1,2,3};

        int pos =0;
        int neg =0;
        for(int n:nums){
            if(n<0){
                neg++;
            }else if(n>0){
                pos++;
            }
        }

        System.out.println(Math.max(pos,neg));
    }
}
