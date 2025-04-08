import java.util.Stack;

public class MinimumStringLengthRemovingSubstrings2696 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        int result = minLength(s);
        System.out.println(result);
    }
    public static int minLength(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()){
            if(!stack.isEmpty() && ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C'))){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        return stack.size();
    }
}
