class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Set<Integer> s = new HashSet<>();

        for (int n : numbers) s.add(n);

        for (int n : s){

            if (s.contains(target - n)) return new int[]{n, target - n};
        }

        return new int[]{};
        
    }
}
