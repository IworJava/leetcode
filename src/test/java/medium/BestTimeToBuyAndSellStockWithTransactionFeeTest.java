package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private final BestTimeToBuyAndSellStockWithTransactionFee obj =
            new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void shouldReturnValidResult() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int expected = 8;

        int actual = obj.maxProfit(prices, fee);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZero() {
        int[] prices = {1};
        int fee = 1;
        int expected = 0;

        int actual = obj.maxProfit(prices, fee);

        assertEquals(expected, actual);
    }
}
