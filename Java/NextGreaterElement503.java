import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement503 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,3};
        int[] result = nextGreaterElement(nums1);
        for (int n : result) {
            System.out.println(n);
        }
    }

    private static int[] nextGreaterElement(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!stack.empty() && (nums[stack.peek()] < nums[index])) {
                result[stack.pop()] = nums[index];
            }
            if (i < nums.length) {
                stack.push(i);
            }
        }
        return result;
    }
}
