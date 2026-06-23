public class Missing_Number_268 {
    public static void main(String args[]){
        int nums[] = {9,6,4,2,3,5,7,0,1};

        int sum =0;
        int add =0;
        int j=1;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            add = add + j;
            j++;
        }

        System.out.println(add-sum);
    }
}
