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
    int num = 0;
    int totalSum = 0;

    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;

        num = (num*10) + root.val;

        sumNumbers(root.left);
        sumNumbers(root.right);

        if(root.left==null && root.right==null)totalSum+=num;
        //list.add(num);
        num/=10;

        return totalSum;
    }
}