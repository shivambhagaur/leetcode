class Solution {
    public int missingNumber(int[] nums) {
        int totalsum =0;
        int present =0;
        int len = nums.length+1;
        for(int i =0;i<len;i++){
            totalsum+=i;
        }
        for(int i =0;i<nums.length;i++){
             present += nums[i];
        }
        int result = totalsum-present;
        return result;
    }
}
