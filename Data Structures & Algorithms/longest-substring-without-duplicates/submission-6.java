class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 1;
        int n = s.length();
        int res = 1;

        while (r < n){
            if (!set.add(s.charAt(r))){
                l++;
                r = l;
                System.out.println(set);
            }else{
                r++;
                res = Math.max(res, r - l);
                System.out.println();
            }
        }

        return set.size() == 0 ? 1 : set.size();
    }
}
