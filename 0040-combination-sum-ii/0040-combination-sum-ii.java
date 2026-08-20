class Solution {
    List<List<Integer>> list = new ArrayList<>();

    void solution(int[] nums, int target, List<Integer> l,int start){
            if(target == 0){
                list.add(new ArrayList<>(l));
                return;
            }

        for(int i = start; i<nums.length; i++){
            if (i > start && nums[i] == nums[i - 1])
                continue;

            if(nums[i] > target){
                    break;
                }

                l.add(nums[i]);
                solution(nums, target - nums[i], l, i+1);
                l.remove(l.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solution(candidates, target, new ArrayList<>(), 0);
        
        return list;
    }
}