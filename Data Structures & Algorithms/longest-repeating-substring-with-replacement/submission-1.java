class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        Map<Character, Integer> map = new HashMap<>(); // Hold whats in the window
        int res = 0;
        int max = 0;

        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            max = Math.max(max, map.get(s.charAt(r)));

            while ((r - l + 1) - max > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(r - l + 1, res);
            r++;
        }

        return res;
    }
}
