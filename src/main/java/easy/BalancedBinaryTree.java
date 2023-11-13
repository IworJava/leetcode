package easy;

import common.TreeNode;

public class BalancedBinaryTree {

    /**
     * 0 ms, 42.60 MB
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return counter(root) != -1;
    }

    private int counter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = counter(root.left);
        int right = counter(root.right);
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.min(left, right) == -1
                ? -1
                : Math.max(left, right) + 1;
    }
}
