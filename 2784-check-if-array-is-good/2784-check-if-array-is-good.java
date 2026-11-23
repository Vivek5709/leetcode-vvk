class Solution {
    public boolean isGood(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;

        for(int n : nums){
            pq.add(n);
            max = Math.max(max, n);
        }

        for(int i = 1; i<=max; i++){
            if(pq.isEmpty()) return false;

            int k = pq.poll();
            if(k != i) return false;
        }

        if(pq.isEmpty()) return false;

        int last = pq.poll();
        if(last != max || !pq.isEmpty()) return false;
        return true;
    }
}