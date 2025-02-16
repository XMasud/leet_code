import java.util.ArrayList;
import java.util.Arrays;

public class MinimumIndexSumOfTwoLists599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        String[] result = findRestaurant(list1, list2);
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {

        if (list1.length < 1 && list2.length < 1)
            return new String[]{};

        ArrayList<String> result = new ArrayList<>();

        int index_sum = Integer.MAX_VALUE;
        int last_index = -1;
        for (int i = 0; i < list1.length; i++) {
            String topic = list1[i];
            for (int j = 0; j < list2.length; j++) {
                if (topic.equals(list2[j])) {

                    index_sum = Math.min(index_sum, i + j);

                    if (i + j <= index_sum) {

                        if(i+j < last_index){
                            result.remove(result.size()-1);
                        }

                        result.add(topic);
                        last_index = i + j;
                    }
                }
            }
        }

        System.out.println(result);

        return result.toArray(new String[0]);
    }
}
