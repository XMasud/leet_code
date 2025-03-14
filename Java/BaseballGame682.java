import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {
    public static void main(String[] args) {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int result = calPoints(ops);
        System.out.println(result);
    }

    public static int calPoints(String[] operations) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            if(isNumeric(operations[i])){
                int n = Integer.parseInt(operations[i]);
                result.add(n);
            }else{
                char c = operations[i].charAt(0);

                if (c == '+') {
                    int val = result.get(result.size() - 1) + result.get(result.size() - 2);
                    result.add(val);
                } else if (c == 'D') {
                    int val = 2 * result.get(result.size() - 1);
                    result.add(val);
                } else if (c == 'C') {
                    result.remove(result.size() - 1);
                }
            }
        }

        int sum = 0;
        for (int n : result) {
            sum = sum + n;
        }

        return sum;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
