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
    static TreeNode val;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        postOrder(root, p, q);
        return val;
    }

    public static void postOrder(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return;

        postOrder(root.left, p, q);
        postOrder(root.right, p, q);
        if (root.val <= q.val || root.val <= p.val) val = root;
    }
}
