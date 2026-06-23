public class Check_if_Any_Element_Has_Prime_Frequency_3591 {
    public static void main(String args[]){
        int []nums = {3,0,3,6,3,3};
        int []arr = new int[nums.length];
        int count =1;
        int k=0;
        int flag =0;
        int index=0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    count++;
                }
            }
            arr[k]=count;
            k++;
            count =1;
        }

        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]);
        }

        for(int n=0;n<arr.length;n++){

            for(int v=1; v<=arr[n]; v++){
                if(arr[n] % v == 0){
                    flag++;
                }
            }

            if(flag == 2){
                index = 1;
                break;
            }
            flag = 0;
        }

        if(index==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}