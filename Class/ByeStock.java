package Class;

public class ByeStock {

    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {//profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit); //global profit-profit of all days
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public int maxSuffix(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] suffixMax = new int[n];
        suffixMax[n - 1] = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(prices[i], suffixMax[i + 1]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            int profit = suffixMax[i + 1] - prices[i]; //Selling price - Buying price
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        ByeStock byeStock = new ByeStock();
        System.out.println(byeStock.maxProfit(prices));
        System.out.println(byeStock.maxSuffix(prices));

    }
}
