public class BestTimeToBuyOrSellStocksTwo {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (start < prices[i]) {
                maxProfit += prices[i] - start;
            }
            start = prices[i];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyOrSellStocksTwo bestTimeToBuyOrSellStocks = new BestTimeToBuyOrSellStocksTwo();
        System.out.println(bestTimeToBuyOrSellStocks.maxProfit(new int[]{7,1,5,3,6,4}));

    }
}
