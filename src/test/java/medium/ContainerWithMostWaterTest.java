package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater obj = new ContainerWithMostWater();

    @Test
    void shouldReturnCorrectResult() {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 5};
        int expected1 = 49;
        int expected2 = 1;

        int actual11 = obj.maxArea(height1);
        int actual12 = obj.maxArea(height2);
        int actual21 = obj.maxArea1(height1);
        int actual22 = obj.maxArea1(height2);

        assertAll(
                () -> assertEquals(expected1, actual11),
                () -> assertEquals(expected2, actual12),
                () -> assertEquals(expected1, actual21),
                () -> assertEquals(expected2, actual22)
        );
    }
}