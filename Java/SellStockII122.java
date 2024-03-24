public class SellStockII122 {

    public static int maxProfit(int[] prices) {

        int profit = 0, left = 0, right = 1;

        while (right< prices.length){

            if (prices[left] < prices[right]){
                profit = profit + (prices[right] - prices[left]);
            }
            left = left+ 1;
            right = right + 1;

        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
