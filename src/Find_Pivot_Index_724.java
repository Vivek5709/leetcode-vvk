public class Find_Pivot_Index_724 {
    public static void main(String args[]){
        int nums[] = {1,7,3,6,5,6};
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i]=sum;
        }
        int k=0;

        for(k=0;k<nums.length;k++){
            if(k==0 && nums[nums.length-1]-nums[k]==0){
                break;
            }else if(k!=0 && nums[k-1]==(nums[nums.length-1]-nums[k])){
                break;
            }else if(k==nums.length-1 && nums[k-1]==0){
                break;
            }
        }

        if(k==nums.length-1){
            System.out.println(-1);
        }else {
            System.out.println(k);
        }

        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j] + " ");
        }
    }
}
