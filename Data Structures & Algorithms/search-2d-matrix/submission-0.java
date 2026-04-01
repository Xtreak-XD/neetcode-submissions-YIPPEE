class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++){
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++){
                if (matrix[i][j] == target) return true;
            }
        }

        return false;
    }
}
