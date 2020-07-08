package offer;

public class TreeLength {


    public int maxDepth(TreeNode root) {

        int left = 0;
        int right = 0;
        if (root == null)
            return 0;

        if (root.left==null&&root.right==null){
            return  1;
        }
        if (root.left != null) {
            left = 1 + maxDepth(root.left);
        }

        if (root.right != null) {
            right = 1 + maxDepth(root.right);
        }

        return Math.max(left, right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
