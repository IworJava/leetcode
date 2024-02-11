package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingStacksTest {

    private final ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();

    @Test
    void should_return_correct_result() {
        obj.push(1);
        obj.push(2);

        int expected = 1;
        int expected1 = 2;

        int actual = obj.pop();
        int actual1 = obj.peek();
        boolean actual2 = obj.empty();

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1),
                () -> assertFalse(actual2)
        );
    }

    @Test
    void should_return_correct_result_with_multiple_requests() {
        obj.push(1);
        obj.push(2);
        obj.pop();
        obj.push(3);
        obj.push(4);

        int expected = 2;
        int expected1 = 3;
        int expected2 = 4;
        int expected4 = 4;

        int actual = obj.pop();
        int actual1 = obj.pop();
        int actual2 = obj.peek();
        boolean actual3 = obj.empty();
        int actual4 = obj.pop();
        boolean actual5 = obj.empty();

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1),
                () -> assertEquals(expected2, actual2),
                () -> assertFalse(actual3),
                () -> assertEquals(expected4, actual4),
                () -> assertTrue(actual5)
        );
    }
}
