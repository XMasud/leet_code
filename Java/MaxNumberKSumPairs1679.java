import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxNumberKSumPairs1679 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        int result = maxOperations(nums, k);
    }

    private static int maxOperations(int[] nums, int k) {

        int count = 0;
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int target = k - nums[i];
            if(result.containsKey(target)){

                count++;

                if(result.get(target) == 1){
                    result.remove(target);
                }else {
                    result.put(target, result.get(target) - 1);
                }
            }else {
                result.put(nums[i], result.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}
