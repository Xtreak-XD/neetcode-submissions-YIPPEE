class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix[0].length - 1;
        System.out.print(matrix[low][high]);

        while (low < high){ 
            int mid = low + (high - low) / 2;
            
            if (matrix[low][mid] == target){
                return true;
            }
            else if (matrix[low][high] > target){
                high = mid;
            } else {
                low++;
            }
        }
        
        return false;
    }
}
