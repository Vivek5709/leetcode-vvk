class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int len =0;
        int j=0;

        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                len++;
            }else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    len--;
                    j++;
                }
                set.add(s.charAt(i));
                len++;
            }
            if(len>max){
                max = len;
            }
        }
    return(max);
    
    }
}