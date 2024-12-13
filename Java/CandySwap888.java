public class CandySwap888 {
    public static void main(String[] args) {
        int[] aliceCandy = {1, 1};
        int[] bobCandy = {2, 2};
        int[] result = fairCandySwap(aliceCandy, bobCandy);

        for (int n: result){
            System.out.println(n);
        }
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];

        int aliceTotal = 0;
        for (int v: aliceSizes){
            aliceTotal = aliceTotal + v;
        }

        int bobTotal = 0;
        for (int v: bobSizes){
            bobTotal = bobTotal + v;
        }

        int mid = (aliceTotal + bobTotal) / 2;

        int aliceSwap = Math.abs(aliceTotal - mid);
        result[0] = aliceSwap;

        int bobSwap = Math.abs(bobTotal - mid);
        result[1] = bobSwap;

        return result;
    }
}
