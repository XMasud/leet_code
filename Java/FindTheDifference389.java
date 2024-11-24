public class FindTheDifference389 {
    public static void main(String[] args) {
        char result = findTheDifference("a", "aa");
        System.out.println(result);
    }

    private static char findTheDifference(String s, String t) {

        if(s.length() > t.length()) return 0;

        int result = 0;
        for (int i = 0; i < t.length(); i++) {
           result = result + t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            result = result - s.charAt(i);
        }

        return (char) result;
    }
}
