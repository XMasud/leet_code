public class DetectCapital520 {
    public static void main(String[] args) {
        String word = "USA";
        boolean result = detectCapitalUse(word);
        System.out.println(result);
    }

    private static boolean detectCapitalUse(String word) {

        if (word.isEmpty())
            return false;

        return (allCaps(word) || allLower(word) || titleCase(word));
    }

    private static boolean allCaps(String word) {

        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            if (val < 65 || val > 90) {
                return false;
            }
        }
        return true;
    }

    private static boolean allLower(String word) {

        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            if (val < 97 || val > 122) {
                return false;
            }
        }
        return true;
    }

    private static boolean titleCase(String word) {

        if (word.charAt(0) < 65 || word.charAt(0) > 90) {
            return false;
        }

        for (int i = 1; i < word.length(); i++) {

            int val = word.charAt(i);
            if (val < 97 || val > 122) {
                return false;
            }
        }
        return true;
    }
}
