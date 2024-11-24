import java.util.HashMap;

public class IsomorphicStrings205 {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);

        System.out.println(result);
    }

    private static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (result.containsKey(original)) {
                if (!result.get(original).equals(replacement)) {
                    return false;
                }
            } else {
                if (!result.containsKey(original) && !result.containsValue(replacement)) {
                    result.put(original, replacement);
                } else
                    return false;
            }
        }

        return true;
    }
}
