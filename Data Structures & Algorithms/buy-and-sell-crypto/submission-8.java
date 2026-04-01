class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int n = prices.length;
        int res = 0;

        while (r < n){
            if (prices[r] < prices[l]){
                l++;
                r = l;
            }else if (prices[r] > prices[l]){
                res = Math.max(res, prices[r] - prices[l]);
            }
            r++;
        }

        return res;
    }
}
