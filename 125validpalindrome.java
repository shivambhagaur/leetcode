class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
         
        int len = a.length();
        String b = new StringBuilder(a).reverse().toString();
       return a.equals(b);
}}
