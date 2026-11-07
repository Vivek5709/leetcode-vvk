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
    void insertNode(TreeNode root, int val){
        if(root == null) return;

        if(root.val > val && root.left == null) root.left = new TreeNode(val);
        else if(root.val < val && root.right == null) root.right = new TreeNode(val);

        if(root.val > val) insertNode(root.left, val);
        else insertNode(root.right, val);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i<preorder.length; i++){
            insertNode(root, preorder[i]);
        }

        return root;
    }
}