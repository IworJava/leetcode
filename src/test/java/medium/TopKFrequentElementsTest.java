package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    private final TopKFrequentElements obj = new TopKFrequentElements();

    @Test
    void shouldReturnValidResult() {
        int[] nums = {1, 2, 5, 0, 0, 3, 0, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {0, 1};

        int[] actual = obj.topKFrequent(nums, k);

        assertArrayEquals(expected, actual);
    }
}