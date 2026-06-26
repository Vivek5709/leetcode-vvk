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
    boolean isFound = false;
    int count = 0;
    int num = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null || isFound)
        return num;

    kthSmallest(root.left, k);

    if (isFound) return num;

    count++;
    if (count == k) {
        isFound = true;
        num = root.val;
        return num;
    }

    kthSmallest(root.right, k);

    return num;
    }
}