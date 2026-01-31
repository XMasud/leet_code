import java.util.Arrays;

public class NumberOfWaysSplitArray2270 {
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        int result = waysToSplitArray(nums);
        System.out.println(result);
    }

    private static int waysToSplitArray(int[] nums) {
        int result = 0;
        long left = 0;

        long sum = Arrays.stream(nums).sum();

        for(int i=0; i < nums.length - 1; i++){
            left = left + nums[i];
            if(left >= sum - left)
                result++;
        }
        return result;
    }
}
