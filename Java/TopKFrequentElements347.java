import java.util.*;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] result = topKFrequent(nums, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> freqNums = new HashMap<>();

        for (int num : nums) {
            freqNums.put(num, freqNums.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freqNums.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            if (i < k) {
                result[i] = entry.getKey();
                i++;
            } else {
                break;
            }
        }
        return result;
    }
}
