package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

    @Test
    void shouldReturnExistingResult() {
        int expected = 2;
        int expected1 = 0;
        int expected2 = 4;
        int expected3 = 1;
        int expected4 = 1;

        int actual = obj.search(new int[]{5, 1, 3}, 3);
        int actual1 = obj.search(new int[]{5, 1, 3}, 5);
        int actual2 = obj.search(new int[]{4, 5, 6, 7, 0, 1, 3}, 0);
        int actual3 = obj.search(new int[]{1, 3}, 3);
        int actual4 = obj.search(new int[]{5,1,2,3,4}, 1);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1),
                () -> assertEquals(expected2, actual2),
                () -> assertEquals(expected3, actual3),
                () -> assertEquals(expected4, actual4)
        );
    }

    @Test
    void shouldReturnMissingResult() {
        int expected = -1;

        int actual = obj.search(new int[]{1, 3}, 2);

        assertEquals(expected, actual);
    }
}
