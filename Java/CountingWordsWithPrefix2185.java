public class CountingWordsWithPrefix2185 {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        int result = prefixCount(words, "at");
        System.out.println(result);
    }

    private static int prefixCount(String[] words, String pref) {

        int count = 0;
        for (String word : words) {
            if (word.length() >= pref.length()) {
                if ((word.substring(0, pref.length())).equals(pref))
                    count++;
            }
        }

        return count;
    }
}
