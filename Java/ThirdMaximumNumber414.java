public class ThirdMaximumNumber414 {
    public static int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max1 > num && num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max2 > num && num > max3) {
                max3 = num;
            }
        }

        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        int result = thirdMax(nums);
        System.out.println(result);
    }
}
