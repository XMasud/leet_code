public class IsSubsequence392 {
    public static void main(String[] args) {
        boolean result = isSubsequence("bb", "ahbgdc");
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {

        if(s.length() == t.length())
            return s.equals(t);

        String word = t;
        for (int j = 0; j < s.length(); j++) {
            char val = s.charAt(j);
            if(word.indexOf(val) == -1){
                return false;
            };
            word = word.substring(word.indexOf(val) + 1, word.length());
        }
        return true;
    }
}
