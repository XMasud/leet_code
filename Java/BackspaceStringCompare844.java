import java.util.Stack;

public class BackspaceStringCompare844 {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        boolean result = backspaceCompare(s,t);
        System.out.println(result);
    }
    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> sstack = new Stack<>();
        Stack<Character> tstack = new Stack<>();

        for (char c: s.toCharArray()){
            if(c == '#' && !sstack.isEmpty()){
                sstack.pop();
            }else{
                if(c != '#'){
                    sstack.push(c);
                }
            }
        }

        for (char c: t.toCharArray()){
            if(c == '#' && !tstack.isEmpty()){
                tstack.pop();
            }else{
                if(c != '#') {
                    tstack.push(c);
                }
            }
        }

        return sstack.equals(tstack);
    }
}
