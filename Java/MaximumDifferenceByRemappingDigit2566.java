import java.util.HashSet;

public class MaximumDifferenceByRemappingDigit2566 {
    public static void main(String[] args) {
        int num = 11891;
        int result = minMaxDifference(num);
        System.out.println(result);
    }
    public static int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        int minVal = Integer.parseInt(numStr.replace(numStr.charAt(0), '0'));
        for (char digit : numStr.toCharArray()) {
            if (digit != '9') {
                return Integer.parseInt(numStr.replace(digit, '9')) - minVal;
            }
        }
        return num - minVal;
    }
}
