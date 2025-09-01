class Solution {
    public int singleNumber(int[] nums) {
       int digit =0;
       for(int j =0;j<nums.length;j++){
            digit^=nums[j];
       }
       return digit;
    }
}
