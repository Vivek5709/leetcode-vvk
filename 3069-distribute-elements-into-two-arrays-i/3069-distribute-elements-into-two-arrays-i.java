class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list =new ArrayList<>();
       for(int n : nums)list.add(n);
       
       List<Integer> list1 =new ArrayList<>();
       List<Integer> list2 =new ArrayList<>();
       
       list1.add(nums[0]);
       list.remove(0);
       list2.add(nums[1]);
       list.remove(0);

       for(int i = 0; i<list.size(); i++){
          if(list1.getLast() > list2.getLast())list1.add(list.get(i));
          else list2.add(list.get(i));
       }
       
       for(int i =0; i<list2.size(); i++){
        list1.add(list2.get(i));
       }

       for(int i =0;i <list1.size(); i++)nums[i]=list1.get(i);

       return nums;
    }
}