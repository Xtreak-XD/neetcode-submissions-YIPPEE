class Solution {
    public boolean isPalindrome(String s) {
        
        char[] s1 = s.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        for (int i = 0; i <= s1.length/2; i++){
            System.out.println(s1[i] + " " + s1[((s1.length - 1) - i)]);
            if (s1[i] != s1[((s1.length - 1) - i)]){
                return false;
            }
        }

        return true;
    }
}
