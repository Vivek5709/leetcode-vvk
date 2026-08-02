class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int []> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        for(int n[]:intervals){
            int first = n[0];
            int second = n[1];
            if(list.isEmpty()){
                list.add(n);
                continue;
            }
            int[] last = list.getLast();
            if(first <= last[1]){
                last[1] = Math.max(last[1],second);
            }else if(first > last[1]){
                list.add(n);
            }
        }
        
        return list.toArray(new int[0][]);
    }
}