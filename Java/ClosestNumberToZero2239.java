public class ClosestNumberToZero2239 {
    public static int findClosestNumber(int[] nums) {

        int min = Integer.MAX_VALUE;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            int distance = Math.abs(nums[i]) - 0;
            if(distance < min){
                min = distance;
                value = nums[i];
            }else if(distance == min){
                value = Math.max(value, nums[i]);
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int[] nums = {2,-1,1};
        int result = findClosestNumber(nums);
        System.out.println(result);
    }
}
