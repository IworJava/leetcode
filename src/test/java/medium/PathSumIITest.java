package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathSumIITest {

    private final PathSumII obj = new PathSumII();

    @Test
    void shouldReturnValidResult() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(5), new TreeNode(1)))
        );
        int target = 22;
        List<List<Integer>> expected = List.of(
                List.of(5, 4, 11, 2),
                List.of(5, 8, 4, 5)
        );

        List<List<Integer>> actual = obj.pathSum(root, target);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnEmptyList() {
        TreeNode root = new TreeNode();
        int target = 22;
        List<List<Integer>> expected = List.of();

        List<List<Integer>> actual = obj.pathSum(root, target);

        assertEquals(expected, actual);
    }
}
