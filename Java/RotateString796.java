public class RotateString796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rotateString(s,goal);
    }

    private static boolean rotateString(String s, String goal) {

        if((s.length() == goal.length()) && ((s+s).contains(goal))) {
            return true;
        }
        return false;
    }
}
