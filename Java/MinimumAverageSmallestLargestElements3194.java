import java.util.Arrays;

public class MinimumAverageSmallestLargestElements3194 {
    public static void main(String[] args) {
        int[] nums = {1, 9, 8, 3, 10, 5};
        double result = minimumAverage(nums);
        System.out.println(result);
    }

    public static double minimumAverage(int[] nums) {

        double avg = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length / 2; i++) {

            avg = Math.min(avg, nums[i] + nums[n - i - 1]);
        }

        return avg / 2.0;
    }
}
