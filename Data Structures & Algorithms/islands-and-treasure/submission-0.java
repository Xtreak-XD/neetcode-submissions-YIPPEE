class Solution {
    public void islandsAndTreasure(int[][] grid) {
        // use a set instead of Min and Max
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < row; i++){

            for (int j = 0; j < col; j++){
                if (grid[i][j] == -1) continue;
            
                if (grid[i][j] == 0) {
                    q.add(new int[]{i,j}); // [0,2] [3,0]
                }
            }
        }
        int distance = 1;
        while (!q.isEmpty()){
            int[] node = q.poll();
            int tempR = node[0];
            int tempC = node[1];
            int[][] dirs = {{1, 0}, {0,1},{-1,0},{0,-1}};

            for (int[] dir : dirs){
                int r = tempR + dir[0];
                int c = tempC + dir[1];
                
                

                if (r < row && c < col && r >= 0 && c >= 0 && grid[r][c] == Integer.MAX_VALUE){

                    q.add(new int[]{r,c});

                    grid[r][c] = grid[tempR][tempC] + 1; 
                }
                
            }
            
        }
        // start at chest, update each thing

    }
}
