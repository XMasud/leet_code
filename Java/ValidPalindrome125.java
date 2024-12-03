public class ValidPalindrome125 {
    public static void main(String[] args) {
        boolean result = isPalindrome("0P");
        System.out.println(result);
    }

    private static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String original = "";

        for (char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                original += c;
            }
        }

        System.out.println(original);

        int start = 0;
        int end = original.length() - 1;

        while (start <= end){
            if(original.charAt(start) == original.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}
