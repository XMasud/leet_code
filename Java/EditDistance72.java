import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EditDistance72 {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int result = minDistance(word1,word2);
        System.out.println(result);
    }

    private static int minDistance(String word1, String word2) {
        int operationCount = 0;

        /*HashMap<Character, Integer> wordMap1 = new HashMap<>();
        HashMap<Character, Integer> wordMap2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            wordMap1.put(word1.charAt(i), wordMap1.getOrDefault(word1.charAt(i),0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            wordMap2.put(word2.charAt(i), wordMap2.getOrDefault(word2.charAt(i),0) + 1);
        }

        for (Map.Entry<Character,Integer> record: wordMap2.entrySet()){
            if(!wordMap1.containsKey(record.getKey())){
                operationCount = operationCount + record.getValue();
            }else{
                operationCount = operationCount + Math.abs(record.getValue() - wordMap1.get(record.getKey()));
                System.out.println(record.getValue() + " - " +wordMap1.get(record.getKey())+ " : " + (record.getValue() - wordMap1.get(record.getKey())));
            }
        }*/

        char wordChar1[] = new char[word1.length()];
        char wordChar2[] = new char[word2.length()];

        int i = 0;
        for (char c: word1.toCharArray()){
            wordChar1[i] = c;
            i++;
        }

        int j = 0;
        for (char c: word2.toCharArray()){
            wordChar2[j] = c;
            j++;
        }

        for (int k = 0; k < wordChar2.length; k++) {
            if(wordChar1[k] != wordChar2[k])
                operationCount++;
        }

        System.out.println(Arrays.toString(wordChar1));
        System.out.println(Arrays.toString(wordChar2));

        return operationCount;
    }
}
