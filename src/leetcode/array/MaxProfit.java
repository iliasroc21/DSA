package leetcode.array;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

}
