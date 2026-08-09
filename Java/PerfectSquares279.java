import java.util.Arrays;
import java.util.HashSet;

public class PerfectSquares279 {
    public static void main(String[] args) {
        int n = 12;
        int result = numSquares(n);
        System.out.println(result);
    }

    private static int numSquares(int n) {

        int[] map = new int[n+1];
        HashSet<Integer> sqRoot = new HashSet<>();

        for (int i = 1; i <= n ; i++) {
            if(isPerfectSquare(i))
                sqRoot.add(i);
        }

        for (int i = 1; i < map.length; i++) {

            map[i] = Integer.MAX_VALUE;

            for (Integer num: sqRoot){

                if(num <= i){
                    int previous = map[i - num];

                    if(previous != Integer.MAX_VALUE){
                        map[i] = Math.min(map[i], 1+ previous );
                    }
                }
            }
        }

        return map[n];
    }

    private static boolean isPerfectSquare(int num){
        if(num < 1)
            return false;

        int sqrt = (int) Math.sqrt(num);

        return (sqrt * sqrt) == num;
    }
}
