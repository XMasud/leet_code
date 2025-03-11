import java.util.Arrays;
import java.util.HashSet;

public class MaximumNumberOfPairsArray2341 {
    public static void main(String[] args) {
        int[] nums = {0};
        int[] result = numberOfPairs(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] numberOfPairs(int[] nums) {
        int[] result = new int[2];

        HashSet<Integer> maps = new HashSet<>();
        int pair = 0;
        for (int value: nums){
            if(maps.contains(value)){
                pair++;
                maps.remove(value);
            }else{
                maps.add(value);
            }
        }
        result[0] = pair;
        result[1] = maps.size();

        return result;
    }
}
