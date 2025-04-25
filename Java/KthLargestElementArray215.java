import java.util.Arrays;

public class KthLargestElementArray215 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int result = findKthLargest(nums,4);
        System.out.println(result);
    }

    private static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}
