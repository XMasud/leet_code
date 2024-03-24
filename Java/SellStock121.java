public class SellStock121 {

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int left = 0, right = 1;

        System.out.println(prices.length);
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                System.out.println(prices[right] +" - "+ prices[left]);
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = left + 1;
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
