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
     List<Integer> list1  = new ArrayList<>();
    List<Integer> list2  = new ArrayList<>();
    
    void createList(TreeNode a,TreeNode b){
        TreeNode temp1 = a;
        TreeNode temp2 = b;

        if(temp1==null || temp2==null){
            return;
        }

        createList(temp1.left,temp2.left);
        createList(temp1.right,temp2.right);
        list1.add(temp1.val);
        list2.add(temp2.val);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        
        if(p==null || q==null){
            return false;
        }
        
        if(p.val != q.val){
            return false;
        }
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}