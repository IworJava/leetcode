package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    private final SymmetricTree obj = new SymmetricTree();

    @Test
    void shouldReturnTrueIfTreeNodeIsSymetric() {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, null, null), null),
                new TreeNode(2, null, new TreeNode(3, null, null))
        );

        boolean actual = obj.isSymmetric(node);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseIfTreeNodeIsNotSymetric() {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, null, null), null),
                new TreeNode(2, new TreeNode(3, null, null), null)
        );

        boolean actual = obj.isSymmetric(node);

        assertFalse(actual);
    }
}