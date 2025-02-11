public class RotateString796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rotateString(s,goal);
    }

    private static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        for (int i = 0; i < s.length(); i++) {

            String temp = temp = s.substring(i,s.length())+ s.substring(0,i);
            if (temp.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
