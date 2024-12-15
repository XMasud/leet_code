public class ReverseVowelsString345 {
    public static void main(String[] args) {
        String s = "leetcode";
        String result = reverseVowels(s);
        System.out.println(result);
    }

    private static String reverseVowels(String s) {

        if (s.isEmpty())
            return "";

        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(ch);
    }

    public static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
