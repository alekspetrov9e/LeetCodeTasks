public class BestTimeToBuyAndSellStockOne {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length - 1) {
            if (prices[r] > prices[l]){
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }else{
                l = r;
            }
            r+=1;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
