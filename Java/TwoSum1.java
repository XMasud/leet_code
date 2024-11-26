import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        int result[] = twoSum(nums, target);

        for (int num: result){
            System.out.println(num);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        if(nums.length < 2)
            return res;

        HashMap<Integer, Integer> data = new HashMap<>();
        int i = 0;
        for (Integer num : nums) {

            int result = target - num;

            if(data.containsKey(result)){
                res[0] = data.get(result);
                res[1] = i;

                return res;
            }

            data.put(num, i);
            i++;
        }

        return res;
    }
}
