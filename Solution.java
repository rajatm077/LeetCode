class Solution {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min_i = 0;
        int max_i = -1;
        int min = prices[0];
        int max = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= min && i < prices.length - 1) {
                max = 0;
                min_i = i;
                min = prices[i];
            }
            if (prices[i] >= max && i > min_i) {
                max = prices[i];
                profit = Math.max(profit, max - min);
            }
        }
        return profit;
    }
}