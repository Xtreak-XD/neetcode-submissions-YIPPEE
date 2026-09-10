class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();

        for (int i : nums){
            if (dup.add(i) == false) return true;
        }

        return false;
    }
}