import java.util.*;

public class Contains_Duplicate_III_220 {
    public static void main(String args[]){
        int []nums = {1,5,9,1,5,9};
        int indexDiff = 2;
        int valueDiff = 3;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff = nums[j]-nums[i];
                if(diff<0){
                    diff = diff * (-1);
                }
                if(j-i<=indexDiff && diff<=valueDiff){
                    System.out.println(true);
                    break;
                }
            }
        }

        System.out.println(false);

    }
}
