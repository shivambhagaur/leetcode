class Solution {
    public int lengthOfLastWord(String s) {
            s = s.trim();
               String [] words = s.split("\\s+");
               String lastword = words[words.length-1];
               return lastword.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Solution sol = new Solution();
        int result = sol.lengthOfLastWord(a);
        System.out.println(result);
    }
}
