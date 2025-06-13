import java.util.Arrays;

public class MinimizeMaximumDifferencePairs2616 {
    public static void main(String[] args) {
        int[] nums = {3,4,2,3,2,1,2};
        int result = minimizeMax(nums,3);
        System.out.println(result);
    }
    public static int minimizeMax(int[] nums, int p) {

        Arrays.sort(nums);
        int low = 0, high = nums[nums.length - 1];

        while (low < high){
            int mid = low + (high - low) / 2;
            if (countPairsWithDifference(nums, mid) >= p){
                high = mid;
            }else {
                low = mid + 1;
            }
        }

        return low;
    }
    private static int countPairsWithDifference(int[] nums, int maxDifference) {
        int pairCount = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            if(nums[i + 1] - nums[i] <= maxDifference) {
                pairCount++;
                i++;
            }
        }

        return pairCount;
    }
}
