class Solution {
    public int findKthLargest(int[] nums, int k) {
        int no = 0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n : nums)maxHeap.add(n);
        for(int i = 0; i<k; i++)no = maxHeap.poll();

        return(no);
    }
}