import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences1207 {
    public static void main(String[] args) {
        int[] num = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean result = uniqueOccurrences(num);
        System.out.println(result);
    }

    private static boolean uniqueOccurrences(int[] num) {

        if(num.length < 1)
            return false;

        HashMap<Integer, Integer> record = new HashMap<>();

        for (int value: num){
            if(record.containsKey(value)){
                record.put(value, record.get(value) + 1);
            }else{
                record.put(value, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> value: record.entrySet()){
            if(set.contains(value.getValue())){
                return false;
            }else {
                set.add(value.getValue());
            }
        }

        return true;
    }
}
