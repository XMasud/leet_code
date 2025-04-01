import java.util.Stack;

public class ClearDigits3174 {
    public static void main(String[] args) {
        String s = "abc";
        String result = clearDigits(s);
        System.out.println(result);
    }

    public static String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder res = new StringBuilder();

        for (char c : stack) {
            res.append(c);
        }

        return res.toString();
    }
}
