class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[prices.length - 1];
        int buy = prices[0];
        int profit = 0;

        int i = prices.length - 1;
        int j = i - 1;
        
        while (true){
            if (j < i && sell - buy > profit) {
                profit = sell - buy;
            }
            if (prices[i] > sell) sell = prices[i];
            if (prices[j] < buy) buy = prices[j];
            i--;
            j--;
        }  

        System.out.print(profit);

        return 0;
    }
}
