package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    private final SameTree obj = new SameTree();

    @Test
    void shouldReturnTrueIfTreeNodesAreSame() {
        TreeNode tn1 = new TreeNode(2,
                new TreeNode(1, null, null),
                new TreeNode(3, null, null)
        );
        TreeNode tn2 = new TreeNode(2,
                new TreeNode(1, null, null),
                new TreeNode(3, null, null)
        );

        boolean actual = obj.isSameTree(tn1, tn2);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseIfTreeNodesDiffer() {
        TreeNode tn1 = new TreeNode(2,
                new TreeNode(1, null, null),
                new TreeNode(3, null, null)
        );
        TreeNode tn2 = new TreeNode(2,
                new TreeNode(3, null, null),
                new TreeNode(1, null, null)
        );

        boolean actual = obj.isSameTree(tn1, tn2);

        assertFalse(actual);
    }
}
