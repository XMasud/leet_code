import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    private static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) return 0;

        int i = 0, j = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
                j++;
            }else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
