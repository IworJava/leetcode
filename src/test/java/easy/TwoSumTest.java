package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

        assertNotNull(actual);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void shouldReturnEmptyResult() {
        int[] expected = {};

        int[] actual = new TwoSum().twoSum(arr, absentTarget);

        assertNotNull(actual);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void shouldReturnEmptyResultWhenArrayIsEmpty() {
        int[] expected = {};

        int[] actual = new TwoSum().twoSum(emptyArr, absentTarget);

        assertNotNull(actual);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}