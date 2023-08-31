package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TwoSumTest {

    private static final int[] arr = {3, 2, 4};
    private static final int[] emptyArr = {};
    private static final int existedTarget = 6;
    private static final int absentTarget = 8;

    @Test
    void shouldReturnExistedResult() {
        int[] expected = {1, 2};

        int[] actual = new TwoSum().twoSum(arr, existedTarget);
        int[] actual1 = new TwoSum().twoSum1(arr, existedTarget);
        int[] actual2 = new TwoSum().twoSum2(arr, existedTarget);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertNotNull(actual1),
                () -> assertNotNull(actual2),
                () -> assertArrayEquals(expected, actual),
                () -> assertArrayEquals(expected, actual1),
                () -> assertArrayEquals(expected, actual2)
        );
    }

    @Test
    void shouldReturnEmptyResult() {
        int[] expected = {};

        int[] actual = new TwoSum().twoSum(arr, absentTarget);
        int[] actual1 = new TwoSum().twoSum1(arr, absentTarget);
        int[] actual2 = new TwoSum().twoSum2(arr, absentTarget);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertNotNull(actual1),
                () -> assertNotNull(actual2),
                () -> assertArrayEquals(expected, actual),
                () -> assertArrayEquals(expected, actual1),
                () -> assertArrayEquals(expected, actual2)
        );
    }

    @Test
    void shouldReturnEmptyResultWhenArrayIsEmpty() {
        int[] expected = {};

        int[] actual = new TwoSum().twoSum(emptyArr, absentTarget);
        int[] actual1 = new TwoSum().twoSum1(emptyArr, absentTarget);
        int[] actual2 = new TwoSum().twoSum2(emptyArr, absentTarget);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertNotNull(actual1),
                () -> assertNotNull(actual2),
                () -> assertArrayEquals(expected, actual),
                () -> assertArrayEquals(expected, actual1),
                () -> assertArrayEquals(expected, actual2)
        );
    }
}