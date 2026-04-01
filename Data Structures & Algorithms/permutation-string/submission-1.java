class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;

        while (r < s2.length()) {
            char rc = s2.charAt(r);
            map.put(rc, map.getOrDefault(rc, 0) + 1);
            r++;

            if (r - l > s1.length()) {
                char lc = s2.charAt(l);
                map.put(lc, map.get(lc) - 1);
                if (map.get(lc) == 0) map.remove(lc);
                l++;
            }

            if (r - l == s1.length() && map.equals(s1Map)) {
                return true;
            }
        }

        return false;
    }
}
