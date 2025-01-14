import java.util.Arrays;

public class MaximumProductOfThreeNumbers628 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = maximumProduct(nums);
        System.out.println(result);
    }

    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int max = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int min = nums[0] * nums[1] * nums[n - 1];

        return Math.max(max, min);
    }
}
