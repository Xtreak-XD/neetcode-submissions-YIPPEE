class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        for (int num : piles) {
            high = Math.max(high, num);
        }
        
        int res = 0;

        while (high >= low){
            int mid = low + (high - low) / 2;
            int sum = 0;

            for (int p : piles){
                sum += (p + mid - 1) / mid;

                if (sum > h) break;
            }

            if (sum <= h){
                res = mid;
                high = mid - 1;
            }else if (sum > h){
                low = mid + 1;
            }
        }

        return res;
        
    }
}