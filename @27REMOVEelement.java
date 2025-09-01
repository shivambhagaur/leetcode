class Solution {
    public int removeElement(int[] nums, int val) {
       int digit =0; 
       for(int i =0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[digit] = nums[i];
            digit++;
        }
       }
    return digit;
    }
}
