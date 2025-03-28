import java.util.HashSet;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        int maxSequenceCount = 0;

        HashSet<Integer> maps = new HashSet<>();

        for (int num : nums) {
            maps.add(num);
        }

        for (int num : maps) {
            if (!maps.contains(num - 1)) {

                int currentSequence = 1;

                while (maps.contains(num + 1)) {
                    currentSequence++;
                    num++;
                }
                maxSequenceCount = Math.max(maxSequenceCount, currentSequence);
            }
        }

        return maxSequenceCount;
    }
}
