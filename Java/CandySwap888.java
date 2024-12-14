import java.util.HashSet;

public class CandySwap888 {
    public static void main(String[] args) {
        int[] aliceCandy = {2};
        int[] bobCandy = {1,3};
        int[] result = fairCandySwap(aliceCandy, bobCandy);
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        if(aliceSizes.length < 1 || bobSizes.length < 1)
            return null;

        HashSet<Integer> bobResult = new HashSet<>();

        int aliceTotal = 0;
        for (int v : aliceSizes) {
            aliceTotal = aliceTotal + v;
        }

        int bobTotal = 0;
        for (int v : bobSizes) {
            bobTotal = bobTotal + v;
            bobResult.add(v);
        }

        int diff = (bobTotal - aliceTotal) / 2;

        for (int alice: aliceSizes){
            if (bobResult.contains(alice+diff)){
                return new int[]{alice, alice+diff};
            }
        }

        return null;
    }
}
