import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> result = new HashMap<>();

        for (String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);

            String key = String.valueOf(c);
            if(!result.containsKey(key)){
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
