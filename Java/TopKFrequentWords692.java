import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords692 {
    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        List<String> res = topKFrequent(words,4);
        System.out.println(res);
    }
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (String word: words){
            map.put(word, map.getOrDefault(word,0) + 1);
        }

        List<String> sortedList = new ArrayList<>(map.keySet());
        sortedList.sort((a,b) -> {
            int freqCompare = map.get(b).compareTo(map.get(a));
            if(freqCompare == 0)
                return a.compareTo(b);
            return freqCompare;
        });

        for (int i = 0; i < k; i++) {
            result.add(sortedList.get(i));
        }

        return result;
    }
}
