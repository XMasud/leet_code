import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 8, 12, 32, 34, 43, 52, 57, 62, 64, 67, 71, 71, 79, 81, 86, 91, 93, 94};
        int[] num2 = {9, 11, 12, 14, 19, 25, 29, 31, 38, 39, 41, 42, 58, 63, 66, 70, 71, 73, 91, 91};
        int result = getCommon(num1, num2);
        System.out.println(result);
    }

    private static int getCommon(int[] num1, int[] num2) {

        HashSet<Integer> valueRecord = new HashSet<>();

        for (int value : num1) {
            valueRecord.add(value);
        }

        int result = -1;
        for (int value : num2) {
            if (valueRecord.contains(value)) {
                result = value;
                break;
            }
        }

        return result;
    }
}
