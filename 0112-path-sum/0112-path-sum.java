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
    boolean isEqual = false;
    int totalSum = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        TreeNode temp = root;
        if(root == null)return isEqual;

        totalSum+=root.val;
        
        if(root.left==null && root.right==null && totalSum==targetSum)isEqual=true;

        hasPathSum(root.left,targetSum);
        hasPathSum(root.right,targetSum);

        totalSum-= root.val;

        return isEqual;
    }
}