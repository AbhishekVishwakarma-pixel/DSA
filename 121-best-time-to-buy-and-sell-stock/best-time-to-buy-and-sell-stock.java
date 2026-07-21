class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int low=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
           if(low>prices[i]) {
            low=prices[i];
            }
            profit=Math.max(profit,prices[i]-low);
        }
        return profit;
    }

}