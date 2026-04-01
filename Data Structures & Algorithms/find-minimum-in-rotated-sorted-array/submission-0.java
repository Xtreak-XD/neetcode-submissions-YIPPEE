class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1; 
        int res = nums[0];    


        while (low <= high){
            int mid = low + (high - low) / 2;
            res = Math.min(res, nums[mid]);

            if (nums[mid] > nums[high]) {
                low = mid + 1;

            }else if (nums[mid] < nums[high]){
                high = mid - 1;
            }else {
                return res;
            }

        }

        return res;
    }
}