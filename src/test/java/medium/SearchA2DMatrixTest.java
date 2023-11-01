package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {

    private final SearchA2DMatrix obj = new SearchA2DMatrix();
    private final int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
    };

    @Test
    void shouldReturnTrueAsTargetExists() {
        int target = 11;
        boolean actual = obj.searchMatrix(matrix, target);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseAsTargetNotExist() {
        int target = 9;
        int target1 = 22;

        boolean actual = obj.searchMatrix(matrix, target);
        boolean actual1 = obj.searchMatrix(matrix, target1);

        assertAll(
                () -> assertFalse(actual),
                () -> assertFalse(actual1)
        );
    }
}