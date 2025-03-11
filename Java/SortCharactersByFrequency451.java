import java.util.*;

public class SortCharactersByFrequency451 {
    public static void main(String[] args) {
        String s = "tree";
        String result = frequencySort(s);
        System.out.println(result);
    }
    public static String frequencySort(String s) {

        HashMap<Character, Integer> words = new HashMap<>();

        for (char c: s.toCharArray()){
            words.put(c, words.getOrDefault(c,0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(words.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : entryList) {
            String word = generateString(entry.getKey(),entry.getValue());
            result.append(word);
        }

        return result.toString();
    }

    public static String generateString(Character c, int counter){
        StringBuilder res = new StringBuilder();
        int start = 0;

        while (start < counter){
            res.append(c);
            start++;
        }
        return res.toString();
    }
}
