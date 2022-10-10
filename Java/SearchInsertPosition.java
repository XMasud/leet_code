public class SearchInsertPosition {

    static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high+1;
    }

    public static void main(String[] args) {

        int[] numberList = {1, 3, 5, 6};
        int target = 2;
        int index = searchInsert(numberList, target);
        System.out.println(index);
    }
}
