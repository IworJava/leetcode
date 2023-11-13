package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {

    private final BestTimeToBuyAndSellStockII obj =
            new BestTimeToBuyAndSellStockII();

    @Test
    void shouldReturnMaxResult() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;

        int actual = obj.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZero() {
        int[] prices = {7, 6, 5, 4, 3, 2, 1};
        int expected = 0;

        int actual = obj.maxProfit(prices);

        assertEquals(expected, actual);
    }
}
