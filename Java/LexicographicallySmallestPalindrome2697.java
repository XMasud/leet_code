import java.util.Arrays;

public class LexicographicallySmallestPalindrome2697 {
    public static void main(String[] args) {
        String s = "seven";
        String result = makeSmallestPalindrome(s);
        System.out.println(result);
    }
    public static String makeSmallestPalindrome(String s) {
        char[] res = new char[s.length()];
        int start = 0, end = s.length() - 1;

        char[] p = s.toCharArray();
        while (start <= end){

            int startV = p[start] - 'a';
            int endV = p[end] - 'a';

            if(startV == endV){
                res[start] = p[start];
                res[end] = p[end];
            } else if (endV > startV) {
                res[start] = p[start];
                res[end] = p[start];
            }else {
                res[end] = p[end];
                res[start] = p[end];
            }

            start++;
            end--;
        }

        return new String(res);
    }
}
