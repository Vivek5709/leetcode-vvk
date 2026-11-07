/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode lca = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || lca != null)return lca;

        lowestCommonAncestor(root.left, p, q);

        if((p.val > root.val && q.val < root.val)
                || (p.val < root.val && q.val > root.val)
                || (p.val == root.val) || (q.val == root.val)){
            lca = root;
        }

        lowestCommonAncestor(root.right, p, q);

        return lca;
    }
}