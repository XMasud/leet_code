import java.util.Arrays;

public class RearrangeArrayElementsSign2149 {

    public static int[] rearrangeArray(int[] nums) {

        int positive = 0, negative = 1;
        int[] result = new int[nums.length];

        for (int num : nums) {
            if (num >= 0) {
                result[positive] = num;
                positive = positive + 2;
            } else {
                result[negative] = num;
                negative = negative + 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1};
        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
