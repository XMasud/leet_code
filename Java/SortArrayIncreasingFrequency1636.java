import java.util.*;

public class SortArrayIncreasingFrequency1636 {
    public static void main(String[] args) {
        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        int[] result = frequencySort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int val : nums) {
            maps.put(val, maps.getOrDefault(val, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(maps.entrySet());
        entryList.sort((a,b)->{
            if (a.getValue().equals(b.getValue())) {
                return b.getKey() - a.getKey();
            } else {
                return a.getValue() - b.getValue();
            }
        });

        System.out.println(entryList);

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                nums[index] = entry.getKey();
                index++;
            }
        }
        return nums;
    }
}
