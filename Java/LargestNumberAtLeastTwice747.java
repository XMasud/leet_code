public class LargestNumberAtLeastTwice747 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result = dominantIndex(nums);
        System.out.println(result);
    }

    private static int dominantIndex(int[] nums) {

        if(nums.length < 2) return -1;

        int max = 0;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            int current_max = Math.max(nums[i], max);
            if (current_max > max) {
                max = current_max;
                index = i;
            }
        }

        for (int num : nums) {

            if ((num != max) && (max < num * 2)) {
                return -1;
            }
        }

        return index;
    }
}
