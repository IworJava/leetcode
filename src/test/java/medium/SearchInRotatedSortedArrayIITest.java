package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayIITest {

    private final SearchInRotatedSortedArrayII obj =
            new SearchInRotatedSortedArrayII();

    @Test
    void shouldReturnTrueIfTargetExists() {
        int[] array = {2, 2, 2, 5, 6, 0, 0, 1, 2};
        int[] array1 = {1, 0, 1, 1, 1};
        int[] array2 = {1, 1, 1, 0, 1};
        int target = 0;

        boolean actual = obj.search(array, target);
        boolean actual1 = obj.search(array1, target);
        boolean actual2 = obj.search(array2, target);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1),
                () -> assertTrue(actual2)
        );
    }

    @Test
    void shouldReturnFalseIfTargetAbsent() {
        int[] array = {2, 2, 2, 5, 6, 0, 0, 1, 2};
        int target = 3;

        boolean actual = obj.search(array, target);

        assertFalse(actual);
    }
}