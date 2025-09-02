class Solution {
    public int thirdMax(int[] nums) {
        Long first =Long.MIN_VALUE;
        Long second =Long.MIN_VALUE;
        Long third =Long.MIN_VALUE;
        for(int num :nums){
            if(first==num||num==second||num==third){
                continue;
            }
            if(first<num){
                third = second;
                second = first;
                first =(long)num;
            }
      
           else if(second<num){
                third =second;
                second = (long)num;
            }
      
            else if(third<num){
                third= (long)num;
            }
            }
         
            
        return third== Long.MIN_VALUE ? first.intValue():third.intValue();
    }
}
