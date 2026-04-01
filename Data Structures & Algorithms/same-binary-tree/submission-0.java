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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null || p.val != q.val) return false;

        TreeNode l = p;
        TreeNode r = q;

        Queue<TreeNode[]> qu = new LinkedList<>();
        boolean[] visited = new boolean[100];

        qu.add(new TreeNode[]{l, r});

        while (!qu.isEmpty()){
            TreeNode[] pair = qu.poll();
            l = pair[0];
            r = pair[1];
            System.out.println(l.val);
            System.out.println(r.val);
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
