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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return DFS(root, subRoot);
    }
    
    public boolean DFS(TreeNode root, TreeNode subRoot){
        if(root == null) return false;

        if (root.val == subRoot.val) if (isSameTree(root, subRoot)) return true;        

        if (root.left != null) if (DFS(root.left, subRoot)) return true;
        if (root.right != null) if (DFS(root.right, subRoot)) return true;

        return false;
    }

    boolean isSameTree(TreeNode l, TreeNode r){
        Queue<TreeNode[]> qu = new LinkedList<>();
        qu.add(new TreeNode[]{l, r});

        while (!qu.isEmpty()){
            TreeNode[] pair = qu.poll();
            l = pair[0];
            r = pair[1];

            if (l.val != r.val) return false;

            if (l.left != null && r.left != null) {
                qu.add(new TreeNode[]{l.left, r.left});
            }else if (l.left == null && r.left != null || l.left != null && r.left == null) return false;

            if (l.right != null && r.right != null) {
                qu.add(new TreeNode[]{l.right, r.right});
            }else if (l.right == null && r.right != null || l.right != null && r.right == null) return false;
        }

        return true;
    }
}
