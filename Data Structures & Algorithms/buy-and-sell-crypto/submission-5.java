class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxP = 0;

        while(sell < prices.length){
            if (prices[sell] - prices[buy] > maxP) 
                maxP = prices[sell] - prices[buy];
            else if (prices[buy] < prices[sell]) 
                sell++;
            else {
                sell++;
                buy++;
            }
        }

        return maxP;
    }
}
