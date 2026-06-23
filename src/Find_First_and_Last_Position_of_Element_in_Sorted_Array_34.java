public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public static void main(String []args){
        int []nums = {5,7,7,8,8,10};
        int target = 8;

        // first occurence

        int i=0;
        while(nums[i]!=target && i!= nums.length-1){
           i++;
        }

        //last occurence

        int j = nums.length-1;
        while(nums[j]!=target && j!=0){
            j--;
        }

        if(i==nums.length-1 && j==0){
            j=-1;
            i=-1;
        }
        System.out.println(j);
        System.out.println(i);

    }
}
