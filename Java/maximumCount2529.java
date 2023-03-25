public class maximumCount2529 {
    public static int maximumCount(int[] nums) {

        int positiveCount = 0, negativeCount = 0;
        if (nums.length > 0) {
            for (int value : nums) {
                if (value != 0) {
                    if (value > 0)
                        positiveCount++;
                    else
                        negativeCount++;
                }
            }
            return Math.max(positiveCount, negativeCount);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 20, 66, 1314};
        int result = maximumCount(nums);
        System.out.println(result);
    }
}
