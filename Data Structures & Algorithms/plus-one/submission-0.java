class Solution {
    public int[] plusOne(int[] digits) {
        String d = "";
        for (int i = 0; i < digits.length; i++){
            d += digits[i];
        }

        int d1 = Integer.parseInt(d);
        d1++;

        d = String.valueOf(d1);
        int[] res = new int[d.length()];

        for (int i = 0; i < d.length(); i++){
            res[i] = Character.getNumericValue(d.charAt(i));
        }

        return res;
    }
}
