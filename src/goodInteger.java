import java.util.HashMap;

public class goodInteger {
    public static void main(String []args){
        int []nums = {1,2,3,4};

        int max_len =0;
        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){

                int max_fq = 1;
                int flag = 0;
                int number = 0;
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int k=i;k<=j;k++){
                    map.put(nums[k],map.getOrDefault(nums[k],0)+1);
                    if(max_fq<map.get(nums[k])){
                        max_fq = map.get(nums[k]);
                        number = nums[k];
                    }
                }

                if(max_fq%2==0) {
                    for(int freq : map.values()){
                        if(freq != max_fq && freq != max_fq/2){
                            flag = 1;
                            break;
                        }
                    }

                    if (flag == 0) {
                        max_len = Math.max(max_len, j - i + 1);
                    }
                }
            }

        }
        System.out.println((max_len)==0?1:max_len);
    }
}
