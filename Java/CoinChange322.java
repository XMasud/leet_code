public class CoinChange322 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int result = coinChange(coins,11);
        System.out.println(result);
    }

    private static int coinChange(int[] coins, int amount) {

        if(amount == 0)
            return 0;

        int[] map = new int[amount+1];

        for (int i = 1; i < map.length; i++) {

            map[i] = Integer.MAX_VALUE;

            for (int coin: coins){
                if(coin <= i && map[i - coin] != Integer.MAX_VALUE){
                    map[i] = Math.min(map[i], 1 + map[i - coin]);
                }
            }
        }

        if(map[amount] == Integer.MAX_VALUE)
            return -1;

        return map[amount];
    }
}
