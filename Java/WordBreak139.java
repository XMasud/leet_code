import java.util.*;

public class WordBreak139 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet","code"));

        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String newS = s.substring(j,i);
                if(dp[j] && dict.contains(newS)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
