public class Sort_Colors_75 {
    public static void main(String args[]){

       // Dutch flag algorithm
        int []nums = {2,0,2,1,1,0};

        int ptr1 = 0;
        int mid =0;
        int ptr2 = nums.length-1;
        int swap =0;

        while(mid<=ptr2){
            if(nums[mid]==2){
                swap = nums[mid];
                nums[mid]=nums[ptr2];
                nums[ptr2]=swap;

                ptr2--;
            }else if(nums[mid]==0){
                swap = nums[mid];
                nums[mid]=nums[ptr1];
                nums[ptr1] = swap;

                ptr1++;
                mid++;
            }
            else{
                mid++;
            }

        }

        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
