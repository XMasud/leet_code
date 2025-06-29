import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumLessthanTarget2824 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int result = countPairs(nums,-2);
        System.out.println(result);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target)
                    count++;
            }
        }

        return count;
    }
}
