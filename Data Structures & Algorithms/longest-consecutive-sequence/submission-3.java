class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int res = 0;
        for (int num : nums) s.add(num);

        for (int num : s){
            if (s.contains(num - 1)) continue;
            
            int count = 1;
            
            while (s.contains(num + count)){
                count++;
            }

            if (count > res) res = count;
        }

        return res;
    }
}