class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int a =num1.length();
        int b = num2.length();
        int [] res = new int[a+b];
        for(int i = a-1;i>=0;i--){
            for(int j= b-1 ;j>=0;j--){
                int mult = (num1.charAt(i)-'0') *(num2.charAt(j)-'0');
                int sum = mult +res[i+j+1];
                 res[i+j+1] = sum%10;
                 res[i+j] +=sum/10;
            }
        } 
        StringBuilder sol = new StringBuilder();
        for(int num :res ){
            if(!(sol.length() ==0 && num ==0)){
                sol.append(num);
            }
        }
        return sol.toString();
    }
}
