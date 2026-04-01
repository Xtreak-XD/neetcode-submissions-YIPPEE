class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        bt(res, new StringBuilder(), 0, 0, n);

        return res;
    }

    public void bt(List<String> res, StringBuilder valid, int open, int close, int n){
        if (open == close && open == n){
            res.add(valid.toString());
            return;
        }

        if (open < n){
            valid.append('(');
            bt(res, valid, open + 1, close, n);
            valid.deleteCharAt(valid.length() - 1);
        }

        if (close < open){
            valid.append(')');
            bt(res, valid, open, close + 1, n);
            valid.deleteCharAt(valid.length() - 1);
        }
    }
}
