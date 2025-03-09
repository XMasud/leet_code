import java.util.HashSet;

public class GoatLatin824 {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        String result = toGoatLatin(sentence);
        System.out.println(result);
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();

        String[] words = sentence.split(" ");

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 1;
        for (String word : words) {
            StringBuilder modifiedWord = new StringBuilder();
            char c = word.charAt(0);
            if (vowels.contains(Character.toLowerCase(c))) {
                modifiedWord.append(word);
                modifiedWord.append("ma");
                modifiedWord.append(generateString(count));
            } else {
                modifiedWord.append(word.substring(1, word.length()));
                modifiedWord.append(word.charAt(0));
                modifiedWord.append("ma");
                modifiedWord.append(generateString(count));
            }
            result.append(modifiedWord).append(" ");
            count++;
        }

        return result.toString().trim();
    }

    private static String generateString(int counter) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < counter; i++) {
            res.append('a');
        }
        return res.toString();
    }
}
