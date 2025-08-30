class Solution {
    public boolean isSubsequence(String s, String t) {
        char []ch = s.toCharArray();
        char [] ab = t.toCharArray();
        int j =0;
       
        for(int i =0;i<s.length();i++){
             boolean result = false;
            for(;j<t.length();j++){
                if(ch[i]==ab[j]){
                   result =true;
                   j++;
                   break;
                }
            
            }
            if(!result){
                return false;
            }
        }
        return true;
    }
}
