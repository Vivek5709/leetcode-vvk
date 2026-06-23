public class Rotate_Array_258 {
    public static void main(String []args){
        int []nums = {1,2,3,4,5,6,7};
        int k = 8;
        int size = nums.length;
        int ptr = nums.length;

        for(int n=0;n<=k;n++){
            ptr=(ptr-1+size)%size;
        }
        ptr++;

        int arr[]=new int[size];

                for(int i=0;i<=7;i++){
                    ptr = (ptr + 1)%size;
                }
            ptr--;

                for(int j=0;j<size;j++){
                    arr[j]=nums[ptr];
                    ptr=(ptr+1)%size;
                }

                for(int m=0;m<size;m++){
                    System.out.print(arr[m]);
                }
    }
}
