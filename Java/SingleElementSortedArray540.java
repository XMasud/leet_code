public class SingleElementSortedArray540 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int result = singleNonDuplicate(nums);
        System.out.println(result);
    }

    private static int singleNonDuplicate(int[] nums) {

        if (nums.length < 2)
            return nums[0];

        for (int i = 1; i < nums.length - 1; i += 2) {

            if ((nums[i] == nums[i + 1])) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
