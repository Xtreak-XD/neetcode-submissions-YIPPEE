class Solution {
    public int maxArea(int[] heights) {
        int l, r;
        int rhh = 0;
        int lhh = 0;
        int li = 0;
        int ri = 0;

        for (l = 0, r = heights.length - 1; r > l; l++, r--){
            int lh = heights[l];
            int rh = heights[r];

            if (rhh < rh) {
                rhh = rh;
                ri = r;
            }
            if (lhh < lh) {
                lhh = lh;
                li = l;
            }
        }

        int height = Math.min(lhh, rhh);
        int width = ri - li;

        return height * width;
    }
}
