class Solution {
    public String longestCommonPrefix(String[] strs) {
        int a = strs[0].length();
        for(int k =0;k<strs.length;k++){
            a = Math.min(a,strs[k].length());
        }
        StringBuilder prefix = new StringBuilder();
        for(int i =0;i<a;i++){
            char ch = strs[0].charAt(i);
            boolean match = true;
            for(int j =0;j<strs.length;j++){
                if(strs[j].charAt(i)!= ch){
                    match = false;
                }
            }
            if(match){
                prefix.append(ch);
            }
            else{
                break;
            }

        }
        if(prefix.length()==0){
            System.out.println("");
        }
        return prefix.toString();
    }
}
