class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int res = 0;

        while (r < s.length()){
            if (set.add(s.charAt(r))){
                r++;
                res = Math.max(res, set.size());
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}