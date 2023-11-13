package medium;

public class BestTimeToBuyAndSellStockII {

    /**
     * 0 ms, 43.91 MB
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                result += prices[i] - min;
            }
            min = prices[i];
        }
        return result;
    }
}
