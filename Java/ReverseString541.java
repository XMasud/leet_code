import java.util.Arrays;

public class ReverseString541 {
    public static void main(String[] args) {
        String s = "abcd";
        String result = reverseStr(s, 2);
        System.out.println(result);
    }

    private static String reverseStr(String s, int k) {
        if (s.isEmpty())
            return null;

        char ch[] = s.toCharArray();

        if (ch.length < k) {
            stringReverse(ch, 0, ch.length-1);
        } else {
            int flag = 1;
            for (int j = 0; j < ch.length - 1; j = j + k) {

                if (flag % 2 != 0) {
                    stringReverse(ch, j, Math.min(j + k - 1, ch.length - 1));
                }
                flag++;
            }
        }

        return new String(ch);
    }

    public static char[] stringReverse(char ch[], int start, int end) {

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return ch;
    }
}
