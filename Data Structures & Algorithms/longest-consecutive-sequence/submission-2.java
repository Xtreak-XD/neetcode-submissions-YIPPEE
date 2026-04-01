class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int res = 0;
        for (int num : nums) s.add(num);

        System.out.print(s.size());

        for (int i = 0; i < s.size(); i++){
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