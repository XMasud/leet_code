import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords648 {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        String result = replaceWords(dictionary, sentence);
    }

    private static String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder result = new StringBuilder();

        for (String dict: dictionary){
            boolean index = sentence.contains(dict);
            
        }

        return result.toString();
    }
}
