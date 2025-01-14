import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvacuateTheBracketPairs1807 {
    public static void main(String[] args) {
        String s = "(a)(b)";
        List<List<String>> knowledge = new ArrayList<>();
        List<String> entry1 = new ArrayList<>();
        entry1.add("a");
        entry1.add("b");
        knowledge.add(entry1);
        List<String> entry2 = new ArrayList<>();
        entry2.add("b");
        entry2.add("a");
        knowledge.add(entry2);
        String result = evaluate(s, knowledge);
        System.out.println(result);
    }

    private static String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> knowledgeMap = new HashMap<>();
        for (List<String> pair : knowledge) {
            knowledgeMap.put(pair.get(0), pair.get(1));
        }

        StringBuilder result = new StringBuilder();

        int start = -1;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                start = i;
            }else if (c == ')') {

                if (start >= 0) {
                    String word = s.substring(start + 1, i);
                    String pair = knowledgeMap.getOrDefault(word, "?");
                    result.append(pair);
                    start = -1;
                }
            } else  {
                if(start == -1)
                    result.append(c);
            }
        }
        return result.toString();
    }
}
