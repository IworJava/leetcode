package easy;

public class BestTimeToBuyAndSellStock {

    /*
        Time Limit Exceeded
     */
    public int maxProfit(int[] prices) {
        int maxResult = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxResult = Math.max(maxResult, prices[j] - prices[i]);
            }
        }
        return maxResult;
    }

    /*
        1 ms, 60.5 MB
     */
    public int maxProfit1(int[] prices) {
        int maxResult = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                maxResult = Math.max(maxResult, prices[i] - min);
            }
        }
        return maxResult;
    }
}
