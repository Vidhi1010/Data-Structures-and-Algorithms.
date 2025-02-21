package Class;

public class StockSuffix {
   

    public static void main(String[] args) {
        StockProfit sp = new StockProfit();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + sp.maxProfit(prices)); // Output: 5
    }
}
