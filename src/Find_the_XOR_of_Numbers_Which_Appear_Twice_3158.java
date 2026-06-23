import java.util.HashMap;

public class Find_the_XOR_of_Numbers_Which_Appear_Twice_3158 {
    public static void main(String args[]){
        int []nums = {1,2,2,1};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        int xor=0;
        //System.out.println(map);

        for(int k:map.keySet()){
            if(map.get(k)==2){
                xor^=k;
            }
        }
        System.out.println(xor);

    }
}
