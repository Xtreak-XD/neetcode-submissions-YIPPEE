class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> charS = new HashSet<>();
        char[] arr = s.toCharArray();
        int j = 0;
        int i = 0;

        while (i < arr.length){
            while (charS.contains(arr[i])) {
                charS.remove(arr[j]);
                j++;
                continue;
            }

            if(i - j + 1> res) res = i - j + 1; // or i - j > res
            charS.add(arr[i]);
            i++;         
        }

        return res;
    }
}
