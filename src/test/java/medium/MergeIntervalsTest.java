package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    private final MergeIntervals obj = new MergeIntervals();

    @Test
    void shouldReturnCorrectResult() {
        int[][] intervals = {
                {1, 10},
                {0, 2},
                {2, 5},
                {4, 6},
                {7, 8}
        };
        int[][] expected = {{0, 10}};

        int[][] actual = obj.merge(intervals);

        assertArrayEquals(expected, actual);
    }
}