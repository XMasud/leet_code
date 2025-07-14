public class SumVariableLengthSubarrays3427 {
    public static void main(String[] args) {
        int[] nums = {3,1,1,2};
        int result = subarraySum(nums);
        System.out.println(result);
    }

    public static int subarraySum(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            result += arrSum(start, i, nums);
        }

        return result;
    }

    public static int arrSum(int start, int end, int[] nums) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
