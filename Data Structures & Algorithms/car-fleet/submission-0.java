class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> stack = new Stack<>();
        int[][] asc = new int[n][2];

        for (int i = 0; i < n; i++) {
            asc[i] = new int[]{position[i], speed[i]};
        }

        Arrays.sort(asc, (a,b)-> Integer.compare(b[0],a[0]));

        for (int[] pair : asc){ 
            double time = (double) (target - pair[0]) / pair[1];

            if (stack.isEmpty() || stack.peek() < time) {
                stack.push(time);
            }            
        }


        return stack.size();
    }
}
