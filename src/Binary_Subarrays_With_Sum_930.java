public class Binary_Subarrays_With_Sum_930 {
    public static void main(String args[]){
        int nums[] = {0,1,1,1,1};
        int goal = 0;
        int sum =0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }

        int p1 =0;
        int p2=0;
        int n = nums.length-1;
        int count =0;
        int i =0;
        int right_count =0;

        while(p1!=n || p2!=n){

            if(i!=0 && nums[p2] - nums[p1-1]==goal){
                count++;
                p2++;
            }else{
                p2++;
            }


            if(p2==nums.length-1){
                p1++;
                p2 = p1+1;
            }
        }
        System.out.println(count);
    }
}
