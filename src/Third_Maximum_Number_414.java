import java.util.*;

public class Third_Maximum_Number_414 {
    public static void main(String args[]){
        int []nums = {-2147483648,1,1};

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
        }

        Collections.sort(list);

        if(list.size()<3){
            System.out.println(list.get(list.size()-1));
        }else{
            System.out.println(list.get(list.size()-3));
        }
    }
}
