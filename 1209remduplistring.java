class Solution {
    public String removeDuplicates(String s, int k) {
        Stack <Character> charst = new Stack<>();
        Stack <Integer> countst = new Stack<>();
        for(char ch :s.toCharArray()){
            if(!charst.isEmpty()&& charst.peek()==ch){
                countst.push(countst.pop()+1);
            }
            else{
                charst.push(ch);
                countst.push(1);
            }
            if(countst.peek()==k){
                charst.pop();
                countst.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<charst.size();i++){
            int count = countst.get(i);
            char ch = charst.get(i);
            for(int j =0;j<count;j++){
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}
