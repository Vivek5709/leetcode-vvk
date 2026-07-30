class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums) set.add(i);

        for(int i:set){
            if(!set.contains(i-1) && i-1>0){
                n = Math.min(i-1,n);
            }
            max = Math.max(max,i);
        }

        if(n == Integer.MAX_VALUE){
            if(max < 0){
                return 1;
            }else{
                return max + 1;
            }
        }else {
            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) n = i;
            }
            return(n);
        }
    }
}