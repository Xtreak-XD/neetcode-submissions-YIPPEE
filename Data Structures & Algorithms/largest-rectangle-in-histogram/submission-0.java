class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int n = heights.length;
        int res = 0;

        for (int i = 0 ; i < n; i++){
            int space = i;
            while (!stack.isEmpty() && stack.peek()[0] > heights[i]){
                int[] last = stack.pop();
                res = Math.max(res, (last[0] * (i - last[1])));
                space = last[1];
            }
            
            stack.push(new int[]{heights[i], space});
        }

        while (!stack.isEmpty()) {
            int[] last = stack.pop();
            res = Math.max(res, last[0] * (n - last[1]));
        }
        return res;
    }
}
