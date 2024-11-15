import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord819 {
    public static String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> result = new HashMap<>();
        HashSet<String> banWord = new HashSet<>();

        for (String ban: banned){
            banWord.add(ban);
        }

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            System.out.println(word);
            if(!banWord.contains(word)){
                if(result.containsKey(word)){
                    result.put(word, result.get(word)+1);
                }else{
                    result.put(word,1);
                }
            }
        }

        String commonWords ="";
        int count = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> value: result.entrySet()){
            if(value.getValue() > count){
                commonWords = value.getKey();;
                count = value.getValue();
            }
        }
        return commonWords;
    }
    public static void main(String[] args) {

        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};

        String result = mostCommonWord(paragraph, banned);
        System.out.println(result);
    }
}
