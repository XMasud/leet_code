import java.util.HashMap;
import java.util.Map;

public class StringsAreAlmostEquivalent2068 {
    public static void main(String[] args) {
        String word1 = "zzzyyy";
        String word2 = "iiiiii";
        boolean result = checkAlmostEquivalent(word1, word2);
        System.out.println(result);
    }

    /*private static boolean checkAlmostEquivalent(String word1, String word2) {

        if(word1.length() != word2.length())
            return false;

        HashMap<Character, Integer> wordMap1 = new HashMap<>();
        HashMap<Character, Integer> wordMap2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {

            char res = word1.charAt(i);

            if (wordMap1.containsKey(res)) {
                wordMap1.put(res, wordMap1.get(res) + 1);
            } else {
                wordMap1.put(res, 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {

            char res = word2.charAt(i);

            if (wordMap2.containsKey(res)) {
                wordMap2.put(res, wordMap2.get(res) + 1);
            } else {
                wordMap2.put(res, 1);
            }
        }

        System.out.println(wordMap1);
        System.out.println(wordMap2);

        for (Map.Entry<Character, Integer> result: wordMap1.entrySet()){
            Character key = result.getKey();
            Integer val = result.getValue();

            int otherVal = 0;
            if(wordMap2.containsKey(key)){
                otherVal = wordMap2.get(key);
            }
            if(Math.abs(otherVal - val) > 3){
                return false;
            }
        }

        return true;
    }*/

    private static boolean checkAlmostEquivalent(String word1, String word2) {

        if(word1.length() != word2.length())
            return false;

        int[] charMapping = new int[26];

        for (int i = 0; i < word1.length(); i++) {

            int resA = word1.charAt(i) - 'a';
            int resB = word2.charAt(i) - 'a';

            charMapping[resA]++;
            charMapping[resB]--;

        }

        for(int val: charMapping){
            if(Math.abs(val) > 3){
                return false;
            }
        }

        return true;
    }

}
