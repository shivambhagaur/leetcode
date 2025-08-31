class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
       TreeSet<Long>  set = new TreeSet<>();
      for(int i =0;i<nums.length;i++){
       long num = nums[i];
       Long ceiling = set.ceiling(num);
       if(ceiling!=null&&ceiling-num <=valueDiff){
        return true;
       }
       Long floor = set.floor(num);
       if(floor!=null&&num-floor<=valueDiff){
        return true;
       }
       set.add(num);
       if(set.size()>indexDiff){
        set.remove((long) nums[i-indexDiff]);
       }
      }
     return false;
    }
}
