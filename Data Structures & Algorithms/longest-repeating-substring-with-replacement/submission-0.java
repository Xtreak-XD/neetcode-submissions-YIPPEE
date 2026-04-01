class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        Map<Character, Integer> map = new HashMap<>(); // Hold whats in the window
        int res = 0;
        map.put(s.charAt(r), 0);

        while(r < s.length()){
            int wLen = r - l + 1;
            int max = Collections.max(map.values());
            if (wLen - max <= k){
                map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
                r++;
            }else{
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(wLen, res);
        }

        return res;
    }
}
