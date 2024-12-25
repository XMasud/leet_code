import java.util.Arrays;

public class FindDuplicate287 {
    public static int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i] == nums[i + 1])
               return nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] num = {3,3,3,3,3};
        int result = findDuplicate(num);
        System.out.println(result);
    }
}
