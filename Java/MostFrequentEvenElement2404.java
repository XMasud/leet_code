import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement2404 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int result = mostFrequentEven(nums);
        System.out.println(result);
    }

    private static int mostFrequentEven(int[] nums) {
        int result = 0;
        int number = Integer.MAX_VALUE;

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num: nums){
            if(num % 2 == 0){
                frequency.put(num, frequency.getOrDefault(num,0)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(value > result){
                result = value;
                number = key;
            } else if (value == result) {
                number = Math.min(key, number);
            }
        }

        if (result == 0)
            return -1;

        return number;
    }
}
