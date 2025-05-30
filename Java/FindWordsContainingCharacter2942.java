import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter2942 {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        List<Integer> count = findWordsContaining(words, x);
        System.out.println(count);
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> count = new ArrayList<>();

        int i = 0;
        for (String word : words) {
            if (word.indexOf(x) != -1)
                count.add(i);
            i++;
        }

        return count;
    }
}
