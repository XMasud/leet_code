public class MaximumNestingDepthParentheses1614 {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        int result = maxDepth(s);
        System.out.println(result);
    }
    public static int maxDepth(String s) {
        int result = 0;
        int open = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                open++;
                result = Math.max(result, open);
            } else if (c == ')') {
                open--;
            }
        }

        return result;
    }
}
