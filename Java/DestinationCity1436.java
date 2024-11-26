import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DestinationCity1436 {
    public static void main(String[] args) {

        List<List<String>> listOfLists = new ArrayList<>();

        listOfLists.add(List.of("qMTSlfgZlC","ePvzZaqLXj"));
        listOfLists.add(List.of("xKhZXfuBeC", "TtnllZpKKg"));
        listOfLists.add(List.of("ePvzZaqLXj", "sxrvXFcqgG"));
        listOfLists.add(List.of("sxrvXFcqgG", "xKhZXfuBeC"));
        listOfLists.add(List.of("TtnllZpKKg", "OAxMijOZgW"));

        //System.out.println(listOfLists);

        String res = destCity(listOfLists);
        System.out.println(res);
    }
    public static String destCity(List<List<String>> paths) {

        HashMap<String,String> route = new HashMap<>();

        for (List<String> row : paths) {
            route.put(row.get(0),row.get(1));
        }

        String start = paths.get(0).get(0);
        String end = paths.get(0).get(1);

        while (end != null){
            start = end;
            end = route.getOrDefault(start, null);
        }

        return start;
    }
}
