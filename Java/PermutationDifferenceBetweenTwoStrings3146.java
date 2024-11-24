public class PermutationDifferenceBetweenTwoStrings3146 {

    public static void main(String[] args) {
        int res = findPermutationDifference("abcde", "edbac");
        System.out.println(res);
    }

    private static int findPermutationDifference(String s, String t) {

        if (s.length() != t.length()) return 0;

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            int index = t.indexOf(letter);

            if (index != -1) {
                result = result + Math.abs(i - index);
            }

        }

        return result;
    }
}
