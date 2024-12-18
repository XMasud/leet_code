public class MaximumAverageSubArray643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        double result = findMaxAverage(nums,4);
        System.out.println(result);
    }

    private static double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        double maxAvg = sum;
        for (int i = k; i < nums.length ; i++) {
            sum = sum + nums[i];
            sum = sum - nums[i - k];
            maxAvg = Math.max(maxAvg,sum);
        }

        return maxAvg / k;
    }
}
