package medium;

public class BestTimeToBuyAndSellStockWithTransactionFee {

    /**
     * 4 ms, 54.44 MB
     */
    public int maxProfit(int[] prices, int fee) {
        int profitAfterBuy = -prices[0];
        int profitAfterSell = 0;

        for (int i = 1; i < prices.length; i++) {
            profitAfterSell = Math.max(profitAfterSell, profitAfterBuy + prices[i] - fee);
            profitAfterBuy = Math.max(profitAfterBuy, profitAfterSell - prices[i]);
        }
        return profitAfterSell;
    }
}
