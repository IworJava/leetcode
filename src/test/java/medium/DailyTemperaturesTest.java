package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    private final DailyTemperatures obj = new DailyTemperatures();

    @Test
    void should_return_correct_result() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures1 = {73, 72, 71, 70, 69, 68, 67, 66};
        int[] temperatures2 = {73, 74, 75, 76, 77, 78, 79, 80};
        int[] temperatures3 = {};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] expected1 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] expected2 = {1, 1, 1, 1, 1, 1, 1, 0};
        int[] expected3 = {};

        int[] actual = obj.dailyTemperatures(temperatures);
        int[] actual1 = obj.dailyTemperatures(temperatures1);
        int[] actual2 = obj.dailyTemperatures(temperatures2);
        int[] actual3 = obj.dailyTemperatures(temperatures3);

        assertAll(
                () -> assertArrayEquals(expected, actual),
                () -> assertArrayEquals(expected1, actual1),
                () -> assertArrayEquals(expected2, actual2),
                () -> assertArrayEquals(expected3, actual3)
        );
    }
}
