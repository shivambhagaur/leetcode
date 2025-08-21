class Solution {
    public int lengthOfLastWord(String s) {
          
              int i = s.length() -1;
              while(i>=0 && s.charAt(i) == ' '){
                i--;
              } 
              int length =0;
              while(i>=0&&s.charAt(i)!=' '){
                length++;
                i--;
              }
               return length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Solution sol = new Solution();
        int result = sol.lengthOfLastWord(a);
        System.out.println(result);
    }
}
