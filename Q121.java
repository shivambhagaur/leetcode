class Solution {
    public int maxProfit(int[] prices) {
       int profit =0;
       int min = Integer.MAX_VALUE;
      for(int prize :prices){
        if(prize<min){
            min = prize;
        }
        else{
            profit = Math.max(profit,prize-min);
        }
      }
         return profit>0?profit:0;  
        }
}
