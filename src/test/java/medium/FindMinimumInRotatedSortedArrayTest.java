package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    private final FindMinimumInRotatedSortedArray obj =
            new FindMinimumInRotatedSortedArray();

    @Test
    void shouldReturnMinNum() {
        int expected = 1;

        int actual = obj.findMin(new int[]{5, 1, 3});
        int actual1 = obj.findMin(new int[]{4, 5, 6, 7, 1, 3});
        int actual2 = obj.findMin(new int[]{1, 3});
        int actual3 = obj.findMin(new int[]{5,1,2,3,4});

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1),
                () -> assertEquals(expected, actual2),
                () -> assertEquals(expected, actual3)
        );
    }
}