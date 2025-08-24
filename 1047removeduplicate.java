class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        for(char ch :s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sd = new StringBuilder();
        for(char ch:st){
            sd.append(ch);
        }
        return sd.toString();
    }
}
