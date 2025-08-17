import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak139 {
    public static void main(String[] args) {
        String s = "abcd";
        List<String> wordDict = new ArrayList<>(Arrays.asList("a","abc","b","cd"));

        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        int start = 0;

        while (start < s.length()) {
            boolean status = false;
            for (String word : wordDict) {
                if(start + word.length() > s.length()){
                    break;
                }
                String newS = s.substring(start, start + word.length());
                if (newS.equals(word)) {
                    start = start + word.length();
                    status = true;
                    //break;
                }
            }

            if (!status){
                return false;
            }

        }

        return true;
    }
}
