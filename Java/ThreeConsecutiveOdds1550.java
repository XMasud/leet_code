public class ThreeConsecutiveOdds1550 {
    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        boolean result = threeConsecutiveOdds(arr);
        System.out.println(result);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int stake = 0;

        for (int value : arr) {

            if (stake == 3)
                return true;

            if (value % 2 != 0) {
                stake++;
            } else {
                stake = 0;
            }
        }

        return stake == 3;
    }
}
