import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntervalsBetweenIdenticalElements2121 {
    public static void main(String[] args) {
        int[] arr = {89600,89602,89600,89601,89604};
        long[] result = getDistances(arr);
        System.out.println(Arrays.toString(result));
    }
    public static long[] getDistances(int[] arr) {

        long[] result = new long[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i,arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
           // result[i] = findInterval(i,map);
        }
        return result;
    }

    public static int findInterval(int key, HashMap<Integer,Integer> map){
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue().equals(map.get(key))){
                sum = sum + Math.abs(key - entry.getKey());
            }
        }
        return sum;
    }
}
