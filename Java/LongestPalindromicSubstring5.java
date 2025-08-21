public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
    public static String longestPalindrome(String s) {

        if(s.length() <= 2)
            return s;

        int max = 0;
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {

                String newSString = s.substring(i,j);
                if(isPalindrome(newSString)){
                    if(newSString.length() > max){
                        max = newSString.length();
                        longestPalindrome = newSString;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String s){

        int start = 0, end = s.length() - 1;

        while (start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
