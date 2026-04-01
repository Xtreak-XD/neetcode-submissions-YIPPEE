class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length < 1) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        int islands = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                int val = grid[i][j];
                if (val == '1') {
                    grid[i][j] = '0';
                    q.add(new int[]{i,j});
                    
                    while (!q.isEmpty()){
                        int[] num = q.poll();
                        int num1 = num[0];
                        int num2 = num[1];
                        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

                        for (int[] dir : dirs){
                            int r = num1 + dir[0];
                            int c = num2 + dir[1];

                            if (r >= 0 && c >= 0 && r < row && c < col && grid[r][c] == '1'){
                                q.add(new int[]{r, c});
                                grid[r][c] = '0';
                            }
                        }
                    }
                    
                    islands++;
                }
            }
        }

        return islands;
    }
}
