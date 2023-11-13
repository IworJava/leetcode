package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    private final List<List<Integer>> result = new ArrayList<>();

    /**
     * 2 ms, 45.49 MB
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0, new ArrayList<>());
        return result;
    }

    private void helper(TreeNode node, int targetSum, int sum, List<Integer> list) {
        if (node == null) {
            return;
        }
        sum += node.val;
        list.add(node.val);

        if (node.left == null && node.right == null && sum == targetSum) {
            result.add(list);
        } else {
            helper(node.left, targetSum, sum, new ArrayList<>(list));
            helper(node.right, targetSum, sum, new ArrayList<>(list));
        }
    }
}
