package easy;


import common.TreeNode;

public class SameTree {

    /**
     * 0 ms, 39.35 MB
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return p.val == q.val &&
               isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
