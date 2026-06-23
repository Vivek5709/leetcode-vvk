public class Rotate_Array_189 {
    public static void main(String args[]){
        int []nums = {1,2};
        int k = 7;
        int n = nums.length;
        int l = (n - (k % n)) % n;

        int []arr = new int[nums.length];
        int j=l;
        int i=0;

        while(j!=(l-1)){
            arr[i] = nums[j];
            j=(j+1)%nums.length;
            i++;
        }
         arr[i]=nums[j];

        for(int m=0;m< nums.length;m++){
            nums[m]=arr[m];

            System.out.println(nums[m]);
        }



    }
}
