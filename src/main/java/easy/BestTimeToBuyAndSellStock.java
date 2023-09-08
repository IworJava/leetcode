package easy;

public class BestTimeToBuyAndSellStock {

    /*
        Time Limit Exceeded
     */
    public int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int maxResult = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxResult = Math.max(maxResult, prices[j] - prices[i]);
            }
        }
        return maxResult;
    }
}
