class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++){
                char v = board[row][i];
                if(v == '.') continue;
                if (!seen.add(v)) {
                    return false;
                }
            }
        } 

        for (int col = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++){
                char v = board[i][col];
                if(v == '.') continue;
                if (!seen.add(v)) {
                    return false;
                    }
            }
        } 

        for (int sq = 0; sq < 9; sq++){
            Set<Character> seen = new HashSet<>();
            int row = (sq / 3) * 3;
            int col = (sq % 3) * 3;
            for (int rows = 0; rows < 3; rows++){
                for (int cols = 0; cols < 3; cols++){
                    char v = board[row + rows][col + cols];
                    if (v == '.') continue;
                    if (!seen.add(v)) {
                        return false;
                    }
                }
            }
        } 

        return true;
    }
}
