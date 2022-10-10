public class SearchInsertPosition {

    static int binarySearch(int[] nums, int low, int high, int target){
        while (low <= high){
            int mid = low + high / 2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                return binarySearch(nums, mid+1, high, target);
            } else {
                return binarySearch(nums, low, mid-1, target);
            }
        }
        return -1;
    }
    static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        if(target>nums[high]){
            return high+1;
        } else if (target < nums[low]) {
            return 0;
        }else
            return binarySearch(nums, low, high, target);

    }

    public static void main(String[] args) {

        int[] numberList = {1, 3, 5, 6};
        int target = 1;
        int index = searchInsert(numberList, target);
        System.out.println(index);
    }
}
