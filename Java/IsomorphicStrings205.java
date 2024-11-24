import java.util.HashMap;

public class IsomorphicStrings205 {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);

        System.out.println(result);
    }

    private static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Character> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sString = s.charAt(i);
            char tString = t.charAt(i);

            if(result.containsKey(sString)){
                if(!result.get(sString).equals(tString)){
                    return false;
                }
            }else {
                if(result.containsValue(tString)){
                    return false;
                }
                result.put(sString, tString);
            }
        }

        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if(result.containsKey(sChar)){
                newStr += result.get(sChar);
            }
        }

        System.out.println(newStr);

        return t.equals(newStr);
    }
}
