public class Find_the_Number_of_Good_Pairs_I_3162 {
    public static void main(String[] args){
        int []nums1 = {1,2,3};
        int []nums2 = {1,2,3};
        int k = 1;

        int count =0;
        for(int i=0;i< nums1.length;i++){
            for(int j=0;j< nums2.length;j++){
                if(nums1[i]%(k*nums2[j])==0)count++;
            }
        }
        System.out.println(count);
    }
}
