public class BuyAndSellStocks {

    public static int stocks(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;//track lowest buying price
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {//profit
                //prices[i] = current price
                int profit = prices[i] - buyPrice;//today's profit
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int stocks2(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(stocks(prices));
        System.out.println(stocks2(prices));
    }
}
