import java.util.Arrays;

public class MinimumDifference1984 {
    public static void main(String[] args) {
        int[] nums = {87063,61094,44530,21297,95857,93551,9918};
        int result = minimumDifference(nums,6);
        System.out.println(result);
    }

    private static int minimumDifference(int[] nums, int k) {

        if(nums.length <= 1)
            return 0;

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            min = Math.min(min,diff);
        }

        return min;
    }
}
