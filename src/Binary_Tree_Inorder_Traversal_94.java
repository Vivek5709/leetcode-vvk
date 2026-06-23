import java.util.ArrayList;
import java.util.List;


public class Binary_Tree_Inorder_Traversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp = root;
        List<Integer> list = new ArrayList<>();

        if(temp == null) return list;
        inorderTraversal(temp.left);
        list.add(temp.val);
        inorderTraversal(temp.right);

        return list;
    }
}
