public class Subarray_Product_Less_Than_K_713 {
    public static void main(String args[]){
        int k=100;

        int product = 1;
        int count = 0;
        int flag = 0;

        /*
        for(int i=0;i< nums.length;i++){
            for(int j=i;j<nums.length;j++){
                product = product * nums[j];

                if(product<k){
                    count++;
                }else if(product>k){
                    break;
                }
            }
            product =1;
        }*/
        int p1 =0;
        int p2 =0;
        int nums[]={10,5,2,6};


        while(flag!=1){
            if(p1==nums.length-1 && p2==nums.length-1){
                flag=1;
            }

            product = product * nums[p2];

            if(product<k){
                p2++;
                count++;
            }else if(product>=k){
                p1++;
                p2=p1;
                product=1;
            }
        }

        System.out.println(count);
        for(int j=0;j< nums.length;j++){
            System.out.println(nums[j]);
        }
    }
}
