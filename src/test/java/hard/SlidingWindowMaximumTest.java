package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum obj = new SlidingWindowMaximum();

    @Test
    void shouldReturnValidResult() {
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] nums2 = {1, -1};
        int window1 = 3;
        int window2 = 1;
        int[] expected1 = {3, 3, 5, 5, 6, 7};
        int[] expected2 = {1, -1};

        int[] actual1 = obj.maxSlidingWindow(nums1, window1);
        int[] actual2 = obj.maxSlidingWindow(nums2, window2);

        assertAll(
                () -> assertArrayEquals(expected1, actual1),
                () -> assertArrayEquals(expected2, actual2)
        );
    }
}