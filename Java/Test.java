import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Alice", 25);
        map.put("Bob", 35);
        map.put("Diana", 20);

        List<String> sortedList = new ArrayList<>(map.keySet());
        sortedList.sort((a,b) ->{
            int freqCompare = map.get(b).compareTo(map.get(a));
            if(freqCompare == 0){
                return a.compareTo(b);
            }
            return freqCompare;
        });

        System.out.println(sortedList);
    }
}
