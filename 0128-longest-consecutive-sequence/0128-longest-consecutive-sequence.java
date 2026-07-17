class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)set.add(i);

        for(int n:set){
            if(!set.contains(n-1)){
                int count = 0;
                while(set.contains(n)){
                    count ++;
                    n ++;
                }

                max = Math.max(max,count);
            }
        }

        return max;
    }
}