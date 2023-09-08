package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    private static final int[] pricesWithAnswer = {7,1,5,3,6,4};
    private static final int[] pricesWithoutAnswer = {7,5,3,1};

    private final BestTimeToBuyAndSellStock obj =
            new BestTimeToBuyAndSellStock();

    @Test
    void shouldReturnMaxProfit() {
        int expected = 5;

        int actual = obj.maxProfit(pricesWithAnswer);
        int actual1 = obj.maxProfit1(pricesWithAnswer);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }

    @Test
    void shouldReturnEmptyResult() {
        int expected = 0;

        int actual = obj.maxProfit(pricesWithoutAnswer);
        int actual1 = obj.maxProfit1(pricesWithoutAnswer);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }

    @Test
    void shouldReturnEmptyResultWhenArrayIsEmpty() {
        int expected = 0;

        int actual = obj.maxProfit(new int[0]);
        int actual1 = obj.maxProfit(new int[0]);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }
}