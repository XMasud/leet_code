public class CountSubarraysLengthThreeWithCondition3392 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int result = countSubarrays(nums);
        System.out.println(result);
    }

    public static int countSubarrays(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (((nums[i] + nums[i + 2]) * 2 == nums[i + 1]))
                count++;
        }

        return count;
    }
}
