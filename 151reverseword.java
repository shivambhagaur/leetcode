class Solution {
    public String reverseWords(String s) {
        String b = s.trim();
        String [] c = b.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i =c.length-1;i>=0;i--){
            sb.append(c[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
