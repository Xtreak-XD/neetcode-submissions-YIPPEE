class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> res = new HashMap<>();

        for (char c : s.toCharArray()){
            res.put(c, res.getOrDefault(c, 0) + 1);
        }

        // System.out.println(res.values());
        // System.out.println(res.keySet());

        for (char c : t.toCharArray()){
            if(!res.containsKey(c)){
                System.out.println(c);
                return false;
            }
            res.put(c, res.getOrDefault(c, 0) - 1);
        }

        //System.out.print(res.values());
        for (int i : res.values()){
            if (i != 0) return false;
        }
        return true;
    }
}
