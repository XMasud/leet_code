public class MaxConsecutiveOnes485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxCount = 0;
        int oneCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                oneCount++;
                maxCount = Math.max(maxCount, oneCount);
            }else {
                oneCount = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {

        int[] nums = {0};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
