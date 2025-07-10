import java.util.HashMap;

public class SeparateBlackWhiteBalls2938 {
    public static void main(String[] args) {
        String s = "11000111";
        long result = minimumSteps(s);
    }
    public static long minimumSteps(String s) {

        long swaps = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                swaps = swaps + ones;
            }else
                ones++;
        }

        return swaps;
    }
}
