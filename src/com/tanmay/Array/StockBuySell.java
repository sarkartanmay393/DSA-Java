package com.tanmay.Array;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int global_profit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Searching for the minimum price possible for purchase.
            } else if (prices[i] - minPrice > global_profit) {
                global_profit = prices[i] - minPrice;
            } // Calculate the profit after getting the lowest buy price.
        }
        return global_profit;
    }

}
