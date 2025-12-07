import java.util.*;

public class NumberOfDistinctAverages2465 {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        int result = distinctAverages(nums);
        System.out.println(result);
    }
    public static int distinctAverages(int[] nums) {

        Arrays.sort(nums);
        Set<Float> disArray = new HashSet<>();

        int start = 0;
        int end = nums.length - 1;

        while (start < end){

            float avg = (float) (nums[start] + nums[end]) / 2;
            disArray.add(avg);

            start++;
            end--;
        }

        return disArray.size();
    }
}
