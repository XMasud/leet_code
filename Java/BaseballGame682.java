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

            if (operations[i].equals("+")) {
                int val = result.get(result.size() - 1) + result.get(result.size() - 2);
                result.add(val);
            } else if (operations[i].equals("D")) {
                int val = 2 * result.get(result.size() - 1);
                result.add(val);
            } else if (operations[i].equals("C")) {
                result.remove(result.size() - 1);
            } else {
                int n = Integer.parseInt(operations[i]);
                result.add(n);
            }
        }

        int sum = 0;
        for (int n : result) {
            sum = sum + n;
        }

        return sum;
    }
}
