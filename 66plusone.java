class Solution {
    public int[] plusOne(int[] digits) {
        int a = digits.length;
        int carry = 1;
        for(int i =a-1;i>=0;i--){
            int sum = digits[i]+carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry>=1){
            int [] newarr = new int[a+1];
            newarr[0] = carry;
            for(int i =0;i<a;i++){
                newarr[i+1] = digits[i];
            }
            digits = newarr;
        }
            return digits;
        
    }
   
}
