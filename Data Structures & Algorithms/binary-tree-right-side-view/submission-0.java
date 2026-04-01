/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        TreeNode head = root;
        rec(head, res);
        
        return res;
    }

    public List<Integer> rec(TreeNode head,List<Integer> res){
        if (head == null) return res;

        int val = head.val;
        res.add(val);

        return rec(head.right, res);
    }
}
