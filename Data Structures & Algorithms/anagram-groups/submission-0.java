class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        for (String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }

            if(!hm.containsKey(Arrays.toString(count))){
                hm.put(Arrays.toString(count), new ArrayList<>());
            }
            
            hm.get(Arrays.toString(count)).add(s);
        }
        
        return new ArrayList<>(hm.values());
    }
}
