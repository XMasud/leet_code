import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        int[] nums = {1,3,3};
        int[] result = findErrorNums(nums);

        System.out.println(Arrays.toString(result));
    }

    private static int[] findErrorNums(int[] nums) {

        if(nums.length < 2) return nums;

        int[] result = new int[2];
        int[] map = new int[nums.length+1];
        Arrays.fill(map,-1);

        for (int num : nums) {
            if (map[num] == 1) {
                result[0] = num;
            }
            map[num] = 1;
        }

        for (int i = 1; i < map.length; i++) {
            if(map[i] == -1){
                result[1] = i;
                break;
            }
        }

        return result;
    }
}
