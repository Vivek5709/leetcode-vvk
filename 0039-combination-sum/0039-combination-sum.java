class Solution {
    List<List<Integer>> list = new ArrayList<>();

    void solution(int[] arr, int target, List<Integer> l, int ind){
        if(ind == arr.length){
            if(target == 0){
                list.add(new ArrayList<>(l));
            }
            return;
        }

        if(arr[ind] <= target){
            l.add(arr[ind]);
            solution(arr,target - arr[ind],l,ind);
            l.remove(l.size() - 1);
        }

        solution(arr, target, l, ind + 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solution(candidates, target, new ArrayList<>(), 0);
        return list;
    }
}