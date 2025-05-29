import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> result = commonChars(words);
        System.out.println(result);
    }
    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        return result;
    }
}
