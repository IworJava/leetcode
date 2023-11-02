package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private final SingleNumber obj = new SingleNumber();

    @Test
    void shouldReturnSingleNumber() {
        int[] nums = {1, 2, 1, 4, 3, 3, 0, 2, 0};
        int expected = 4;

        int actual = obj.singleNumber(nums);

        assertEquals(expected, actual);
    }
}