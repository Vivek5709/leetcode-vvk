class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        set.add(new ArrayList<>());

        for(int n:nums){
            int size = set.size();

            for(int i = 0; i<size; i++){
                List<Integer> subset = new ArrayList<>(set.get(i));
                subset.add(n);
                set.add(subset);
            }
        }

        return set;
    }
}