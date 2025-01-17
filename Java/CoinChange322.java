public class CoinChange322 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int result = coinChange(coins,12);
    }

    private static int coinChange(int[] coins, int amount) {

        if(amount == 0)
            return 0;

        int[] map = new int[amount+1];

        for (int i = 1; i < map.length; i++) {
            int total = 0;
            for (int coin: coins){
                
            }
        }

        return 0;
    }
}
