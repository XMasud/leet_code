public class SellStock121 {

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int left = 0, right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right += 1;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = {1,2,4,2,5,7,2,4,9,0,9};
        System.out.println("Result : "+maxProfit(price));
    }
}
