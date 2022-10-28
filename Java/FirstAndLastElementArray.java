import java.util.Arrays;

public class FirstAndLastElementArray {

    public static int firstElementSearch(int[] nums, int target){
        int res = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = (high + low)/2;
            if(target == nums[mid]){
                res = mid;
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return res;
    }

    public static int lastElementSearch(int[] nums, int target){
        int res = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = (high + low)/2;
            if(target == nums[mid]){
                res = mid;
                low = mid + 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return res;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstElementSearch(nums, target);
        result[1] = lastElementSearch(nums, target);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
