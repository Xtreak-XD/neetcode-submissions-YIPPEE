class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> s = new HashSet<>();
        int res = 0;

        for (int num : nums) s.add(num);

        for (int i = 0; i < nums.length; i++){
            if (s.contains(nums[i] - 1)) continue;
            
            int count = 1;
            
            while (s.contains(nums[i] + count)){
                count++;
            }

            if (count > res) res = count;
        }

        return res;
    }
}