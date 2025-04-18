public class MinimumNumberOperationsMakeElementsArrayDistinct3396 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 3, 3, 5, 7};
        int result = minimumOperations(nums);
        System.out.println(result);
    }

    public static int minimumOperations(int[] nums) {
        int[] res = new int[101];
        int lastIndex = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            res[nums[i]]++;

            if (res[nums[i]] > 1) {
                lastIndex = i + 1;
                break;
            }
        }

        if (lastIndex % 3 == 0)
            return lastIndex / 3;

        return (lastIndex / 3) + 1;
    }
}
