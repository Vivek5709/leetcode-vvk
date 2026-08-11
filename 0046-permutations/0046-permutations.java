class Solution {
    void solution(int arr[], List<List<Integer>> largeList, List<Integer> smallList, boolean[] freq){
        if(smallList.size() == arr.length){
            largeList.add(new ArrayList<>(smallList));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!freq[i]){
                smallList.add(arr[i]);
                freq[i] = true;
                solution(arr, largeList, smallList, freq);
                smallList.remove(smallList.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> largeList = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        solution(nums, largeList, smallList, freq);

        return largeList;    
    }
}