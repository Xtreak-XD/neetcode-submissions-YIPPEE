class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length < 1) return 0;

        int row = grid.length;
        int col = grid[0].length;
        int res = 0;

        for (int i = 0;i<row;i++){
            for (int j = 0; j < col;j++){
                int val = grid[i][j];
                if (val == 1){
                    res = Math.max(res, BFS(grid, i, j));
                }
            }
        }

        return res;
    }

    public int BFS(int[][] grid, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        int area = 0;

        q.add(new int[]{r, c});
        grid[r][c] = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()){
            int[] val = q.poll();
            int val1 = val[0];
            int val2 = val[1];

            area++;

            for (int[] dir : dirs){
                int row = val1 + dir[0];
                int col = val2 + dir[1];
                
                if (row >= 0 && 
                col >= 0 && 
                row < grid.length && 
                col < grid[0].length && 
                grid[row][col] == 1){
                    q.add(new int[]{row, col});
                    grid[row][col] = 0;
                    
                }
            }
        }
        return area;
    }
}