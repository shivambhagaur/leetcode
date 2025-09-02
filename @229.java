class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate =0;
        int candidate2=0;
        int count =0;
        int count2=0;
        for(int num:nums){
            
            if(candidate==num){
                count++;
            }
            else if(candidate2==num){
                count2++;
            }
             else if(count==0){
                candidate = num;
                count =1;
            }
             else if(count2==0){
                candidate2 = num;
                count2=1;
             }
            else{
                count--;
                count2--;
            }
        }
         count =0;
         count2=0;
        for(int num :nums){
            if(num==candidate){
                count++;
            }
            if(num==candidate2){
                count2++;
            }
        }
         List<Integer> result = new ArrayList<>();
        if(count>nums.length/3){
            result.add(candidate);
        }
        if(count2>nums.length/3&&candidate2!=candidate){
            result.add(candidate2);
        }
       
        return result ;
    }
}
