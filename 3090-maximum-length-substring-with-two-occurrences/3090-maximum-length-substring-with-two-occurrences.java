class Solution {
    public int maximumLengthSubstring(String s) {
        
        int left=0;
        int right=0;
        int max_len=0;
        HashMap<Character,Integer> map=new HashMap<>();

        while(right<s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), 1);
            } else {
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            }

            if (map.get(s.charAt(right)) > 2) {
                max_len = Math.max(max_len, right - left);
                while (map.get(s.charAt(right)) > 2) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    left++;
                }
            }
                right++;
        }
        max_len=Math.max(max_len,right-left);
        return(max_len);
    }
}