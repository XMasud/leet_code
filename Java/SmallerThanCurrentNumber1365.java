import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SmallerThanCurrentNumber1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);

        for (Integer res: result){
          //  System.out.println(res);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = nums.clone();

        if (nums.length < 2)
            return result;

        Arrays.sort(nums);
        HashMap<Integer, Integer> record = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!record.containsKey(nums[i])){
                record.put(nums[i],i );
            }
        }

        for (int i = 0; i < result.length; i++) {
            if(record.containsKey(result[i])){
                result[i] = record.get(result[i]);
            }
        }

        return result;
    }
}
