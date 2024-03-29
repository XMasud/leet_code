public class FactorialTrailingZeroes172 {

    public static int trailingZeroes(int n) {

        int result = 0;

        while (n > 0){
            n = n/5;
            result = result + n;
        }

        return result;
    }
    public static void main(String[] args) {
        int n = 3;
        int result = trailingZeroes(n);
        System.out.println(result);
    }
}
