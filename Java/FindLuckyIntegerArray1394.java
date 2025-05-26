import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerArray1394 {
    public static void main(String[] args) {
        int[] value = {1,2,3,3};
        int result = findLucky(value);
    }
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int n : arr){
            result.put(n, result.getOrDefault(n, 0) + 1);
        }

        int max = -1;
        for(Map.Entry<Integer, Integer> entry: result.entrySet()){
            if(entry.getKey() == entry.getValue()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                }
            }
        }

        return max;
    }
}
