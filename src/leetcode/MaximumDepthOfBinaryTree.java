package leetcode;

//104
public class MaximumDepthOfBinaryTree implements TestSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return depth(root);
    }

    public int maxDepth1(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int depth(TreeNode node) {
        if (node.left == null && node.right == null) return 1;

        int left = 0, right = 0;
        left = node.left != null ? depth(node.left) : 0;
        right = node.right != null ? depth(node.right) : 0;
        return Math.max(left, right) + 1;
    }

    @Override
    public void test() {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        System.out.println(maxDepth1(tree));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
