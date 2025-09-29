import java.util.Arrays;

public class SingleNumberII137 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,5,5,5,6};
        int result = singleNumber(nums);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {

        if(nums.length < 2)
            return nums[0];

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i += 3) {
            if(nums[i] != nums[i - 1])
                return nums[i - 1];
        }

        return nums[nums.length - 1];
    }
}
