class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int res = 0;
        int count = 1;

        for(int n : nums){
            set.add(n);
        }

        for (int n : set){
            count = 1;
            if(!set.contains(n - 1)){
                while (set.contains(n + count)){
                    count++;
                }
            }

            res = Math.max(res, count);
        }

        return res;
    }
}
