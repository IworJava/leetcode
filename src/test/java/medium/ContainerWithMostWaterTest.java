package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater obj = new ContainerWithMostWater();

    @Test
    void shouldReturnCorrectResult() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height1 = {1, 5};
        int expected = 49;
        int expected1 = 1;

        int actual = obj.maxArea(height);
        int actual1 = obj.maxArea(height1);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1)
        );
    }
}