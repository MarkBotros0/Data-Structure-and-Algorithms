package leetcode;

public class _121_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int diff = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > diff) {
                diff = prices[i] - min;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
