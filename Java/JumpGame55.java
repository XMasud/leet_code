public class JumpGame55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean result = canJump(nums);
        System.out.println(result);
    }

    private static boolean canJump(int[] nums) {

        int last_position = nums.length - 1;

        for (int i = last_position; i >=0 ; i--) {
            if(i + nums[i] >= last_position){
                last_position = i;
            }
        }

        return last_position == 0;
    }
}
