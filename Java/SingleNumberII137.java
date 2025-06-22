import java.util.Arrays;

public class SingleNumberII137 {
    public static void main(String[] args) {
        int[] nums = {30000,500,100,30000,100,30000,100};
        int result = singleNumber(nums);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        if(nums[0] != nums[1])
            return nums[0];

        if(nums[nums.length-2] != nums[nums.length-1])
            return nums[nums.length-1];

        for (int i = 1; i < nums.length - 2;) {
            if(nums[i + 1] != nums[i])
                return nums[i];
        }

        return -1;
    }
}
