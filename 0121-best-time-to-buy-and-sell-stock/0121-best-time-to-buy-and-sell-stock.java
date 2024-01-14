class Solution {
    public int maxProfit(int[] prices) {
     
        int maxProfit=0;
        int minIndex=0;
      for(int i=1;i<prices.length;i++){
         if(prices[minIndex]>prices[i]){
             minIndex=i;
             
         }
          else{
                    maxProfit=Math.max(prices[i]-prices[minIndex],maxProfit);
          }
      }
        return maxProfit; 
    }
}