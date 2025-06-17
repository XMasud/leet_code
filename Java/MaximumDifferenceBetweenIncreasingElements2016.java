public class MaximumDifferenceBetweenIncreasingElements2016 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        int result = maximumDifference(nums);
        System.out.println(result);
    }

    public static int maximumDifference(int[] nums) {

        int minValue = Integer.MAX_VALUE;
        int max = -1;

        for (int num : nums) {
            if (num > minValue) {
                max = Math.max(max, num - minValue);
            } else{
                minValue = num;
            }
        }

        return max;
    }
}
