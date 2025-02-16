import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCodeWords804 {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        int result = uniqueMorseRepresentations(words);
        System.out.println(result);
    }

    public static int uniqueMorseRepresentations(String[] words) {

        if(words.length < 1)
            return 0;

        String[] mapping = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> result = new HashSet<>();
        for (String word : words) {

            StringBuilder letters = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                int val = word.charAt(i) - 'a';
                letters.append(mapping[val]);
            }
            result.add(letters.toString());
        }

        return result.size();
    }
}
