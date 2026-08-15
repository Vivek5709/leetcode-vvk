class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)map.put(n,map.getOrDefault(n,0)+1);

        for(int n : nums){
            int n1 = n - k;
            int n2 = n + k;

            if(map.containsKey(n1)) count += map.get(n1);
            if(map.containsKey(n2)) count += map.get(n2);

            map.put(n, map.get(n) - 1);
            if(map.get(n) == 0) map.remove(n);
        }

        return count;
    }
}