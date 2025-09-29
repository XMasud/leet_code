import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Raough {
    public static void moveZeroes(int[] nums) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice",5);
        map.put("Max",15);
        map.put("Marc",25);
        map.put("Jack",1);
        map.put("Keny",51);

        Map<String,Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));

        Map<String,Integer> desSortValue = map.entrySet()
                        .stream()
                        .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1,e2)->e1,
                                LinkedHashMap::new
                        ));

        System.out.println(desSortValue);
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
