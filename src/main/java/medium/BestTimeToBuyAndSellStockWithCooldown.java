package medium;

public class BestTimeToBuyAndSellStockWithCooldown {

    /**
     * 0 ms, 40.61 MB
     */
    public int maxProfit(int[] prices) {
        int profitAfterBuy = -prices[0];
        int profitAfterSell = 0;
        int prevSell = 0;
        int prevBuy;

        for (int i = 1; i < prices.length; i++) {
            prevBuy = profitAfterBuy;
            profitAfterBuy = Math.max(profitAfterBuy, prevSell - prices[i]);
            prevSell = profitAfterSell;
            profitAfterSell = Math.max(profitAfterSell, prevBuy + prices[i]);
        }
        return profitAfterSell;
    }
}
