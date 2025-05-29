import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithSpecialDiscountShop1475 {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        int[] result = finalPrices(prices);
        System.out.println(Arrays.toString(result));
    }
    public static int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek()> prices[i]) {
                stack.pop();
            }
            int finalPrice = prices[i];
            if(!stack.isEmpty()){
                finalPrice = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
            prices[i] = finalPrice;
        }

        return prices;
    }
}
