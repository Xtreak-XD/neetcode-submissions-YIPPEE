class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = 0;
        int maxP = 0;
        
        for (int i = 0; i < prices.length; i++){
            buy = prices[i];
            for (int j = i; j < prices.length; j++){
                sell = prices[j];
                if (sell - buy > maxP) maxP = sell - buy;
            }
        }

        System.out.print("buy: " + buy + " sell: " + sell + " profit: " + maxP);

        return maxP;
    }
}
