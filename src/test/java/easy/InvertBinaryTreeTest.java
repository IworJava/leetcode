package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    private final InvertBinaryTree obj = new InvertBinaryTree();

    @Test
    void should_return_correct_result() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(7,
                        new TreeNode(6,
                                new TreeNode(5),
                                null
                        ),
                        new TreeNode(8,
                                null,
                                new TreeNode(9)
                        )
                )
        );
        TreeNode expected = new TreeNode(4,
                new TreeNode(7,
                        new TreeNode(8,
                                new TreeNode(9),
                                null
                        ),
                        new TreeNode(6,
                                null,
                                new TreeNode(5)
                        )
                ),
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1)
                )
        );

        TreeNode actual = obj.invertTree(root);
        TreeNode actual1 = obj.invertTree(null);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertNull(actual1)
        );
    }
}
