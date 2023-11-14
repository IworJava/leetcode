package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithCooldownTest {

    private final BestTimeToBuyAndSellStockWithCooldown obj =
            new BestTimeToBuyAndSellStockWithCooldown();

    @Test
    void shouldReturnValidResult() {
        int[] prices = {1, 2, 3, 0, 2};
        int expected = 3;

        int actual = obj.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZero() {
        int[] prices = {3, 2, 1, 0};
        int expected = 0;

        int actual = obj.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroIfOnePrice() {
        int[] prices = {3};
        int expected = 0;

        int actual = obj.maxProfit(prices);

        assertEquals(expected, actual);
    }
}
