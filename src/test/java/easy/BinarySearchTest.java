package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch obj = new BinarySearch();

    @Test
    void should_return_correct_result() {
        int[] nums = {-1,0,3,5,9,12};
        int target = nums[4];
        int target1 = nums[0];
        int target2 = nums[nums.length - 1];
        int target3 = 8;

        int expected = 4;
        int expected1 = 0;
        int expected2 = nums.length - 1;
        int expected3 = -1;

        int actual = obj.search(nums, target);
        int actual1 = obj.search(nums, target1);
        int actual2 = obj.search(nums, target2);
        int actual3 = obj.search(nums, target3);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1),
                () -> assertEquals(expected2, actual2),
                () -> assertEquals(expected3, actual3)
        );
    }

    @Test
    void should_return_correct_result_on_null() {
        int expected = -1;

        int actual = obj.search(null, 5);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_correct_result_on_empty_array() {
        int[] nums = {};
        int expected = -1;

        int actual = obj.search(nums, 5);

        assertEquals(expected, actual);
    }
}