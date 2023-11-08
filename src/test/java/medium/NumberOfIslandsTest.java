package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    private final NumberOfIslands obj = new NumberOfIslands();

    @Test
    void shouldReturnCorrectAnswer() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        int expected = 3;

        int actual = obj.numIslands(grid);
        int actual1 = obj.numIslands1(grid);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }
}
