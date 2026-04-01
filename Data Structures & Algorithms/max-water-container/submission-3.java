class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int rhh = 0;
        int lhh = 0;
        int li = 0;
        int ri = 0;
        int res = 0;

        while (l < r) {
            int lh = heights[l];
            int rh = heights[r];

            if (lhh < lh) {
                lhh = lh;
                li = l;
            }
            if (rhh < rh) {
                rhh = rh;
                ri = r;
            }

            res = Math.max(res, Math.abs(ri - li) * Math.min(lhh, rhh));

            if (lh < rh) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
