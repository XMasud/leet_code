public class SearchInsertPosition35 {

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int target = 2;
        int[] nums = {1, 3};

        int result = searchInsert(nums, target);

        System.out.println(result);
    }
}
