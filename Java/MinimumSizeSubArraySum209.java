import java.util.Arrays;

public class MinimumSizeSubArraySum209 {
    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;
        int result = minSubArrayLen(nums, target);
        System.out.println(result);
    }

    private static int minSubArrayLen(int[] nums, int target) {

        int length = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int total = nums[i];
            int count = 1;

            if(total >= target)
                return count;

            for (int j = i+1; j < nums.length; j++) {
                total = total + nums[j];
                count++;

                if (total >= target) {
                    length = Math.min(length, count);
                    break;
                }
            }
        }
        return length;
    }
}
