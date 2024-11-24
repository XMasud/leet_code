import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedArray448 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        HashSet<Integer> record = new HashSet<>();

        int start = 1;
        int end = nums.length;

        for (Integer num : nums) {
            record.add(num);
        }

        while (start <= end) {
            if (!record.contains(start)) {
                result.add(start);
            }
            start++;
        }
        return result;
    }
}
