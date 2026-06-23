import java.util.Arrays;

public class Partition_Array_According_to_Given_Pivot_2161 {
    public static void main(String args[]){
        int []nums = {9,12,5,10,14,3,10};
        int pivot = 10;

        int count =0;
        int count_pivot =0;
        for(int n:nums){
            if(n<pivot){count++;}
            if(n==pivot){count_pivot++;}
        }

        int arr[] = new int[nums.length];
        int p2 = count + count_pivot;
        int p1 =0;

        for(int n : nums){
            if(n<pivot){
                arr[p1] = n;
                p1++;
            }else if(n>pivot){
                arr[p2] =n;
                p2++;
            }else{
                arr[count] = n;
                count++;
            }
        }


        System.out.println(count_pivot);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
