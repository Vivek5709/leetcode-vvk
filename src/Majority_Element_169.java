public class Majority_Element_169 {
    public static void main(String args[]){
        int []nums = {8,8,7,7,7};
        int n= nums.length;
        int half = n/2;
        System.out.println(n);
        if(n%2!=0){
            half++;
        System.out.println(half);
        }
        int max =0;
        int count =0;
        int i=0;

        while(!(count>half)){
             for(int j=0;j<n;j++){
                 if(nums[i]==nums[j]){
                     count++;
                 }
             }
             max=nums[i];
             i++;
        }

        System.out.println(max);
    }
}
