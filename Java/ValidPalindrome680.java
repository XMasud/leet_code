public class ValidPalindrome680 {
    public static void main(String[] args) {
        String s = "deeee";
        boolean result = validPalindrome(s);
        System.out.println(result);
    }

    private static boolean validPalindrome(String s) {

        if(s.length() == 1)
            return true;

        if(checkPalindrome(s))
            return true;

        for (int i = 0; i < s.length(); i++) {

            String result = s.substring(0, i) + s.substring(i + 1);
            if(checkPalindrome(result))
                return true;
        }
        return false;
    }

    private static boolean checkPalindrome(String s){

        int start = 0;
        int end = s.length() - 1;

        while (start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
