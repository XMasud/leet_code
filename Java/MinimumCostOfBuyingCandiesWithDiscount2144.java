import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount2144 {
    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        int result = minimumCost(cost);
        System.out.println(result);
    }

    private static int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int count = 0;
        int pay = 0;
        for (int i = cost.length - 1; i >= 0 ; i--) {
            count++;
            if(!(count % 3 == 0)){
                pay = pay + cost[i];
            }
        }

        return pay;
    }
}
