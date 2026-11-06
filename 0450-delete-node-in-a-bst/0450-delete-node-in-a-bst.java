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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        if(root.val == key) return joinNode(root);

        TreeNode temp = root;
        while(temp != null){
            if(temp.val == key) break;

            if(key > temp.val) temp = temp.right;
            else temp = temp.left;
        }

        TreeNode node = joinNode(temp);

        temp = root;
        while(temp != null){
            if(temp.left != null && temp.left.val == key) {
                temp.left = node;
                break;
            }else if(temp.right != null && temp.right.val == key){
                temp.right = node;
                break;
            }

            if(key > temp.val) temp = temp.right;
            else temp = temp.left;
        }

        return root;
    }

    TreeNode joinNode(TreeNode node){
        if(node == null) return null;
        if(node.left == null) return node.right;

        TreeNode temp = node.left;
        while(temp.right != null){
            temp = temp.right;
        }

        temp.right = node.right;

        return node.left;
    }
}