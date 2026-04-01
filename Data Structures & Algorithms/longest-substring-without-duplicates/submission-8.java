class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        int res = 0;

        while (r < n){
            if (!set.add(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }else{
                r++;
                res = Math.max(res, r - l);
            }
        }

        return res;
    }
}
