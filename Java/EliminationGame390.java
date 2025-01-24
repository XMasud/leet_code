import java.util.HashSet;

public class EliminationGame390 {
    public static void main(String[] args) {
        int n = 9;
        int result = lastRemaining(n);
    }

    public static int lastRemaining(int n) {

        if (n == 1)
            return 1;
        int num = -1;

        HashSet<Integer> result = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }

        System.out.println(getLastValue(result, 9));

        return num;
    }

    public static HashSet<Integer> getLastValue(HashSet<Integer> result, int flag) {

        if (result.size() == 2)
            return result;


        for (int i = 1; i <= flag; i++) {
            if (flag % 2 == 1) {
                if (i % 2 == 1)
                    result.remove(i);
            } else { // 2 4 6 8
                if (i % 2 == 0)
                    result.remove(i);
            }
        }


        flag = result.size();

        return getLastValue(result, flag);
    }
}
