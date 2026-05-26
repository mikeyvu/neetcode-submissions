class Solution {
    public int maxProfit(int[] prices) {
        int leftBuy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < leftBuy) {
                leftBuy = prices[i];
            } else {
                profit = Math.max(prices[i] - leftBuy, profit);
            }
        }

        return profit;
    }
}
