class Solution {
    public int[] sortedSquares(int[] nums) {
        int a = nums.length;
        int [] arr = new int[a];
        for(int i =0;i<a;i++){
            arr[i]= nums[i]*nums[i];
        }
       Arrays.sort(arr);
        return arr;
    }
}
