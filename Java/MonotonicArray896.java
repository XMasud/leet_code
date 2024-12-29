public class MonotonicArray896 {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        boolean result = isMonotonic(nums);
        System.out.println(result);
    }

    private static boolean isMonotonic(int[] nums) {

        if(isIncreasing(nums)){
            return true;
        } else if (isDecreasing(nums)) {
            return true;
        }else
            return false;
    }

    private static boolean isIncreasing(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int n: nums){
            if(n >= max){
                max = n;
            }else
                return false;
        }
        return true;
    }

    private static boolean isDecreasing(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int n: nums){
            if(n <= min){
                min = n;
            }else
                return false;
        }
        return true;
    }
}
