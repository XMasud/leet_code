import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPositiveSumSubarray3364 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -2, 1, 4));
        int result = minimumSumSubarray(nums, 2, 3);
        System.out.println(result);
    }

    private static int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false;

        for (int size = l; size <= r; size++) {
            int currentSum = 0;

            for (int i = 0; i < size; i++) {
                currentSum += nums.get(i);
            }

            if (currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
                found = true;
            }

            for (int i = size; i < n; i++) {
                currentSum += nums.get(i) - nums.get(i - size);
                if (currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                    found = true;
                }
            }
        }
        return found ? minSum : -1;
    }
}
