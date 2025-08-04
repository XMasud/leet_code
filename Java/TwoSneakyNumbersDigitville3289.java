import java.util.Arrays;
import java.util.HashMap;

public class TwoSneakyNumbersDigitville3289 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0};
        int[] result = getSneakyNumbers(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getSneakyNumbers(int[] nums) {

        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int i = 0;
        for (Integer key: map.keySet()){
            if(map.get(key) > 1)
                result[i++] = key;
        }

        return result;
    }
}
