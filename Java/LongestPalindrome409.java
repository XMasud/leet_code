public class LongestPalindrome409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        int result = longestPalindrome(s);
        System.out.println(result);
    }

    private static int longestPalindrome(String s) {

        int[] charCount = new int[128];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int count = 0;
        for (int val : charCount) {
            count += (val / 2) * 2;
            if ((count % 2 == 0) && ((val % 2 == 1))) {
                count += 1;
            }
        }

        return count;
    }

}
