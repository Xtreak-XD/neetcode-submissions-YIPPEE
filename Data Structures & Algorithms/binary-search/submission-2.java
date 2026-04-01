class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target){
                return mid;
            }else if (target > nums[mid]){
                low = mid + 1;
                System.out.println("low " + low);
            }else{
                high = mid - 1;
                System.out.println("High " + high);
            } 
        }

        return -1;
        
    }
}
