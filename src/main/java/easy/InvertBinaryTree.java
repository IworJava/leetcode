package easy;

import common.TreeNode;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {

    /**
     * 0 ms, 41.06 MB
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode buf = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(buf);
        return root;
    }
}
