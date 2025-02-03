public class ValidPalindrome680 {
    public static void main(String[] args) {
        String s = "deeee";
        boolean result = validPalindrome(s);
        System.out.println(result);
    }

    private static boolean validPalindrome(String s) {

        if (s.length() == 1)
            return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1);

            left++;
            right--;
        }
        return true;
    }

    private static boolean checkPalindrome(String s, int start, int end) {

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
