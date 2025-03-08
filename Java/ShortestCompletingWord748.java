import java.util.Arrays;

public class ShortestCompletingWord748 {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = {"looks","pest","stew","show"};
        String result = shortestCompletingWord(licensePlate, words);
        System.out.println(result);
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {

        int[] licensePlateCounter = wordCount(licensePlate.toLowerCase());

        String shortestCompletingWord = null;

        int minLength = 16;

        for (String word : words) {

            if (word.length() >= minLength) {
                continue;
            }
            int[] wordCounter = wordCount(word);
            if (matchWord(licensePlateCounter, wordCounter)) {
                minLength = word.length();
                shortestCompletingWord = word;
            }
        }
        return shortestCompletingWord;
    }

    private static int[] wordCount(String words) {

        int[] map = new int[26];

        for (char c : words.toCharArray()) {
            if (Character.isLetter(c)) {
                map[c - 'a']++;
            }
        }
        return map;
    }

    private static boolean matchWord(int[] licensePlate, int[] word) {

        for (int i = 0; i < 26; i++) {
            if (licensePlate[i] > word[i])
                return false;
        }
        return true;
    }
}
