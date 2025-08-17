class Solution {
    public int maxProfit(int[] prices) {
        int i,j,n=prices.length,buy=prices[0],profit=0;
        for(i=1;i<n;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-buy);
            }
        }
        return profit;
    }
}