class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 1;

        for(int n : nums){
            set.add(n);
        }

        for (int i = 0; i < set.size(); i++){
            if(set.contains(nums[i] + res)){
                while (set.contains(nums[i] + res)){
                    res++;
                }
            }
        }

        return res;
    }
}
