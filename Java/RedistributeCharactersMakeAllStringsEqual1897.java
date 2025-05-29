import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersMakeAllStringsEqual1897 {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        boolean result = makeEqual(words);
    }
    public static boolean makeEqual(String[] words) {

        HashMap<Character,Integer> result = new HashMap<>();

        for (String word: words){
            for (char c: word.toCharArray()){
                result.put(c,result.getOrDefault(c,0)+1);
            }
        }

        for (Map.Entry<Character,Integer> entry: result.entrySet()){
            if(entry.getValue() % words.length != 0)
                return false;
        }

        return true;
    }
}
