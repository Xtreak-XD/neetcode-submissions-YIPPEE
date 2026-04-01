class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[prices.length - 1];
        int buy = prices[0];

        int i = prices.length - 1;
        int j = 0;
        while (i > j){
            if (prices[i] > sell) sell = prices[i];
            if (prices[j] < buy) buy = prices[j];
            i--;
            j++;
        }

        System.out.print(buy + " " + sell);

        return buy < sell ? sell - buy : 0;        
    }
}
