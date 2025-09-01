class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int digit =0;
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
             map.remove(nums[i]);
            }
            else{
                map.put(nums[i],1);
              digit++;
            }
        }
        for(int elements: map.keySet()){
            return elements;
        }
        return -1;
    }
}
