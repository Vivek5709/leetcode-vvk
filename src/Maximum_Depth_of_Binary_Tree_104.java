public class Maximum_Depth_of_Binary_Tree_104 {
    static int count = 1;
    static int max_depth = 0;

    public static int maxDepth(TreeNode root) {
        TreeNode temp = root;

        if(temp==null){
            max_depth = Math.max(max_depth,count);
            count--;
            return 0;
        }

        count++;
        maxDepth(temp.left);
        maxDepth(temp.right);

        return max_depth;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
}
