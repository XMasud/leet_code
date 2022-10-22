import java.util.Arrays;

public class RunningSumOfOneDimensionArray {

    public static int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        int count = 0;
        for (int i=0; i<nums.length;i++){
            count = nums[i] + count;
            array[i] = count;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] list = {1,1,1,1,1};
        int[] result = runningSum(list);
        System.out.println(Arrays.toString(result));
    }
}
