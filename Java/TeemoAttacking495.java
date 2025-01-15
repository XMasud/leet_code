public class TeemoAttacking495 {
    public static void main(String[] args) {
        int[] timeSeries = {1, 4};
        int duration = 2;
        int result = findPoisonedDuration(timeSeries, duration);
        System.out.println(result);
    }

    private static int findPoisonedDuration(int[] timeSeries, int duration) {

        int total = duration;

        for (int i = 1; i < timeSeries.length; i++) {

            int timeDifference = timeSeries[i] - timeSeries[i - 1];
            total += Math.min(timeDifference, duration);
        }

        return total;
    }
}
