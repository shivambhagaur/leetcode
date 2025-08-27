class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int maxlen = 0;
        HashSet <Character> set = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxlen = Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
}
