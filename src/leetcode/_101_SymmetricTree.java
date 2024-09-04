package leetcode;

//101
public class _101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.right, root.left);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null & right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right,right.left);
    }

}