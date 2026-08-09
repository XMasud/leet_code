import java.util.ArrayList;
import java.util.Arrays;

public class LimitOccurrencesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] result = limitOccurrences(nums,1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] limitOccurrences(int[] nums, int k) {

        ArrayList<Integer> result = new ArrayList<>();

        int count = 1;
        result.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]){
                count++;
                if(count <= k){
                    result.add(nums[i]);
                }
            }else {
                count = 1;
                result.add(nums[i]);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
