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
        boolean actual1 = obj.searchMatrix1(matrix, target);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1)
        );
    }

    @Test
    void shouldReturnFalseAsTargetNotExist() {
        int target = 9;
        int target1 = 22;

        boolean actual = obj.searchMatrix(matrix, target);
        boolean actual1 = obj.searchMatrix(matrix, target1);
        boolean actual2 = obj.searchMatrix1(matrix, target);
        boolean actual3 = obj.searchMatrix1(matrix, target1);

        assertAll(
                () -> assertFalse(actual),
                () -> assertFalse(actual1),
                () -> assertFalse(actual2),
                () -> assertFalse(actual3)
        );
    }
}