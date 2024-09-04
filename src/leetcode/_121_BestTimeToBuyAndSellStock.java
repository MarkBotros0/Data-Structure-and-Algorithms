package leetcode;

public class _121_BestTimeToBuyAndSellStock implements TestSolution{
    public int maxProfit(int[] prices) {
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

    @Override
    public void test() {

    }
}
