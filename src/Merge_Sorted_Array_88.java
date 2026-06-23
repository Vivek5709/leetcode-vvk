public class Merge_Sorted_Array_88 {
    public static void main(String args[]){
        int []nums1 = {1,3,6,7,9,0,0,0,0};
        int []nums2 = {2,4,5,8};
        int m = 5;
        int n = 4;
        int j=0;

        for(int i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(nums2[i]<nums1[j]){
                    break;
                }
            }
            for(int k=nums1.length-1;k>j;k--){
                nums1[k] = nums1[k-1];
            }
            nums1[j]=nums2[i];
            m++;
        }

        for(int x=0;x<nums1.length;x++){
            System.out.println(nums1[x]);
        }
    }
}
