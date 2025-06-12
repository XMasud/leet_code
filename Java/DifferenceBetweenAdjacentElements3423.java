public class DifferenceBetweenAdjacentElements3423 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int result = maxAdjacentDistance(nums);
    }

    public static int maxAdjacentDistance(int[] nums) {

        if (nums.length < 2)
            return 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                max = Math.max(Math.abs(nums[i] - nums[0]), max);
            } else {
                max = Math.max(Math.abs(nums[i] - nums[i + 1]), max);
            }
        }

        return max;
    }
}
