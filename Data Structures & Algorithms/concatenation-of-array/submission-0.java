class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        
        System.out.print((nums.length - 1));
        for (int i = 0; i < nums.length * 2; i++){
            ans[i] = nums[i % nums.length];
        }
        
        return ans;
    }
}