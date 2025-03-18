import java.util.HashMap;

public class IntegerReplacement397 {
    public static void main(String[] args) {
        int n = 8;
        int result = integerReplacement(n);
        System.out.println(result);
    }

    public static int integerReplacement(int n) {
        HashMap<Long, Integer> result = new HashMap<>();
        return process(n, result);
    }

    public static int process(long n, HashMap<Long, Integer> result) {

        if (n == 1)
            return 0;

        if (result.containsKey(n)){
            return result.get(n);
        }

        int count = 0;

        if (n % 2 == 0) {
            count = 1 + process(n / 2, result);
        } else{
            count = Math.min(process(n + 1, result), process(n - 1, result)) + 1;
        }

        result.put(n, count);

        return count;
    }
}
