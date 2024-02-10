package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    private final FloodFill obj = new FloodFill();

    @Test
    void should_return_correct_result() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] expected = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };

        int[][] actual = obj.floodFill(image, sr, sc, color);

        assertArrayEquals(expected, actual);
    }

    @Test
    void should_return_null_on_null() {
        int[][] actual = obj.floodFill(null, 1, 1, 2);

        assertNull(actual);
    }

    @Test
    void should_return_correct_result_on_empty_array() {
        int[][] image = new int[][]{};
        int[][] expected = new int[][]{};

        int[][] actual = obj.floodFill(image, 1, 1, 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void should_return_correct_result_on_incorrect_parameters() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] expected = image;

        int[][] actual = obj.floodFill(image, -1, 1, 2);
        int[][] actual1 = obj.floodFill(image, 1, -1, 2);
        int[][] actual2 = obj.floodFill(image, image.length, 1, 2);
        int[][] actual3 = obj.floodFill(image, 1, image[1].length, 2);

        assertAll(
                () -> assertArrayEquals(expected, actual),
                () -> assertArrayEquals(expected, actual1),
                () -> assertArrayEquals(expected, actual2),
                () -> assertArrayEquals(expected, actual3)
        );
    }
}
