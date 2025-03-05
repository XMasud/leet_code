import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups830 {
    public static void main(String[] args) {
        String s = "babaaaabbb";
        List<List<Integer>> result = largeGroupPositions(s);
        System.out.println(result);

    }

    public static List<List<Integer>> largeGroupPositions(String s) {


        List<List<Integer>> finalResult = new ArrayList<>();

        if (s.isEmpty())
            return new ArrayList<>();

        int start = 0;
        int end = 0;
        char lastChar = s.charAt(0);
        int i = 1;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (currentChar == lastChar) {
                end = i;
                if (i + 1 == s.length()) {
                    int diff = end - start;
                    if (diff >= 2) {
                        List<Integer> result = new ArrayList<>();
                        result.add(start);
                        result.add(end);
                        finalResult.add(result);
                    }
                }
                i++;
            } else {
                int diff = end - start;

                if (diff >= 2) {
                    List<Integer> result = new ArrayList<>();
                    result.add(start);
                    result.add(end);
                    finalResult.add(result);
                }

                lastChar = s.charAt(i);
                start = i;
                end = i;
                i++;
            }
        }

        return finalResult;
    }
}
