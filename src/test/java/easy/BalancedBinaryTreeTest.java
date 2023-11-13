package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree obj = new BalancedBinaryTree();

    @Test
    void shouldReturnTrueIfTreeNodeIsBalanced() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(7),
                                null),
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(6))
        );

        boolean actual = obj.isBalanced(root);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseIfTreeNodeIsNotBalanced() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2)
        );

        boolean actual = obj.isBalanced(root);

        assertFalse(actual);
    }
}
