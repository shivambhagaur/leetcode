import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger a2 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);

        BigInteger sum = a2.add(b2);
        return sum.toString(2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Solution sol = new Solution();
        String result = sol.addBinary(a,b);
        System.out.println(result);
    }
}
