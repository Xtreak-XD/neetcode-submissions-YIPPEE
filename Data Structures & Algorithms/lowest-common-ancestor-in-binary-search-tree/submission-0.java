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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return inOrder(root, p, q);
    }

    public static TreeNode postOrder(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return root;

        inOrder(root.left, p, q);
        inOrder(root.right, p, q);
    }
}
