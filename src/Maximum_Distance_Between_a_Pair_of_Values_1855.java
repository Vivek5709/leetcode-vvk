public class Maximum_Distance_Between_a_Pair_of_Values_1855 {
    public static void main(String args[]){
        int []nums1 = {30,29,19,5};
        int []nums2 = {25,25,25,25,25};

        int left=0;
        int right=nums2.length-1;
        int mid=left+(right-left)/2;
        int max=-1;

        for(int i=0;i<nums1.length;i++){
            while(nums2[mid]>=nums1[i] && nums2[mid]<=nums1[i] && left!=right){
                mid=left+(right-left)/2;
                if(nums1[i]>nums2[mid]){
                    right=mid-1;
                }else if(nums1[i]<nums2[mid]){
                    left=mid+1;
                }
            }
            left=i;
            right=nums2.length-1;
           // System.out.println(nums1[i]);
           // System.out.println(nums2[mid]);
            if(i<=mid && left!=right) {
                max = Math.max(max, Math.abs(i - mid));
            }
        }
        System.out.println((max==-1)?0:max);
    }
}
