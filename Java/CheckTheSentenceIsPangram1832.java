import java.util.HashSet;

public class CheckTheSentenceIsPangram1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }

    public static boolean checkIfPangram(String sentence) {

        HashSet<Character> characters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            characters.add(c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if(!characters.contains(c))
                return false;
        }

        return true;
    }
}
