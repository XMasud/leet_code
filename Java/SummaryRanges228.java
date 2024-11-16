import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
                i++;
            }
            if (start != nums[i]) {
                result.add("" + start + "->" + nums[i]);
            } else {
                result.add("" + start + "");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = summaryRanges(nums);
        System.out.println(result);
    }
}
