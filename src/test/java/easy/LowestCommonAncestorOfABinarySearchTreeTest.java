package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfABinarySearchTreeTest {

    private final LowestCommonAncestorOfABinarySearchTree obj =
            new LowestCommonAncestorOfABinarySearchTree();

    @Test
    void should_return_correct_result() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(5)
                        )
                ),
                new TreeNode(8,
                        new TreeNode(8),
                        new TreeNode(9)
                )
        );
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(0);
        TreeNode p3 = new TreeNode(7);
        TreeNode p4 = new TreeNode(5);

        TreeNode q1 = new TreeNode(7);
        TreeNode q2 = new TreeNode(3);
        TreeNode q3 = new TreeNode(8);
        TreeNode q4 = new TreeNode(5);

        int expected1 = 6;
        int expected2 = 2;
        int expected3 = 8;
        int expected4 = 5;

        TreeNode actual1 = obj.lowestCommonAncestor(root, p1, q1);
        TreeNode actual2 = obj.lowestCommonAncestor(root, p2, q2);
        TreeNode actual3 = obj.lowestCommonAncestor(root, p3, q3);
        TreeNode actual4 = obj.lowestCommonAncestor(root, p4, q4);

        assertAll(
                () -> assertEquals(expected1, actual1.val),
                () -> assertEquals(expected2, actual2.val),
                () -> assertEquals(expected3, actual3.val),
                () -> assertEquals(expected4, actual4.val)
        );
    }

    @Test
    void should_return_null_on_null() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(5)
                        )
                ),
                new TreeNode(8,
                        new TreeNode(8),
                        new TreeNode(9)
                )
        );
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(0);

        TreeNode actual1 = obj.lowestCommonAncestor(null, p, q);
        TreeNode actual2 = obj.lowestCommonAncestor(root, null, q);
        TreeNode actual3 = obj.lowestCommonAncestor(root, p, null);

        assertAll(
                () -> assertNull(actual1),
                () -> assertNull(actual2),
                () -> assertNull(actual3)
        );
    }
}
