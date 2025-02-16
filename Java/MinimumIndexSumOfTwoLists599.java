import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists599 {
    public static void main(String[] args) {
        String[] list1 = {"S", "TEXP", "BK", "KFC"};
        String[] list2 = {"KFC", "BK", "S"};

        String[] result = findRestaurant1(list1, list2);
    }

    public static String[] findRestaurant1(String[] list1, String[] list2) {

        if (list1.length < 1 && list2.length < 1)
            return new String[]{};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        ArrayList<String> result = new ArrayList<>();
        int index_sum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int currentIndex = i + map.get(list2[i]);

                if (currentIndex < index_sum) {

                    result = new ArrayList<>();
                    result.add(list2[i]);
                    index_sum = currentIndex;

                } else if (currentIndex == index_sum) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
