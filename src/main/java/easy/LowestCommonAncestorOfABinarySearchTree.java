package easy;

import common.TreeNode;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA)
 * node of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor
 * is defined between two nodes p and q as the lowest node in T that has both p
 * and q as descendants (where we allow a node to be a descendant of itself).”
 * Constraints:
 * -10^9 <= Node.val <= 10^9
 * All Node.val are unique.
 * p and q will exist in the BST.
 */
public class LowestCommonAncestorOfABinarySearchTree {

    /**
     * 5 ms, 44.61 MB
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if (p.val == q.val) {
            return p;
        }
        return helper(root, p.val, q.val);
    }

    private TreeNode helper(TreeNode node, int a, int b) {
        if (a >= node.val && b <= node.val
            || a <= node.val && b >= node.val) {
            return node;
        }
        return a < node.val
                ? helper(node.left, a, b)
                : helper(node.right, a, b);
    }
}
