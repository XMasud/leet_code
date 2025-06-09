public class MaximumAscendingSubarraySum1800 {
    public static void main(String[] args) {
        int[] nums = {100,10,1};
        int result = maxAscendingSum(nums);
        System.out.println(result);
    }

    public static int maxAscendingSum(int[] nums) {
        int result = nums[0];
        int previous = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > previous) {
                result = result + nums[i];
                previous = nums[i];
            } else {
                result = nums[i];
                previous = nums[i];
            }
            max = Math.max(result, max);
        }

        return max;
    }
}
