import java.util.ArrayList;
import java.util.List;

public class StringMatch1408 {
    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> result = stringMatching(words);
        System.out.println(result);
    }

    public static List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];

                if (word1.length() >= word2.length()) {
                    continue;
                }

                if (checkSubString(word1, word2)) {
                    result.add(word1);
                    break;
                }
            }
        }

        return result;
    }

    private static boolean checkSubString(String word1, String word2) {
        if (word2.contains(word1))
            return true;

        return false;
    }
}
