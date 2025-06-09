import java.util.Arrays;

public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] nums = {3,6,1,2,4};
        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortArrayByParity(int[] nums) {

        if(nums.length < 1)
            return nums;
        int left = 0, right = nums.length -1;
        while (left < right) {

            if (nums[left] % 2 == 1) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                left++;
            }
        }

        return nums;
    }
}
