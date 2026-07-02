class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        boolean []temp = new boolean[101];
        List<Integer> list = new ArrayList<>();

        for(int n:bulbs)temp[n] ^= true;
        for(int i=0;i<temp.length;i++){
            if(temp[i])list.add(i);
        }

        return list;
    }
}