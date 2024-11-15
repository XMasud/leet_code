import java.util.Arrays;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {

        if (nums.length < 2) {
            nums = new int[]{0};
        } else {
            //Tracking non zero element
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            //Inserting 0
            for (int i = index; i < nums.length; i++) {
                nums[i] = 0;
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

}