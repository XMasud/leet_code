import java.util.Arrays;

public class LeftRightSumDifferences2574 {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] res = leftRightDifference(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] leftRightDifference(int[] nums) {

        int[] result = new int[nums.length];
        int leftSum = 0, rightSum = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            result[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return result;
    }
}
