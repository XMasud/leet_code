public class SumOfDigitsBaseK1837 {
    public static void main(String[] args) {
        int result = sumBase(34,6);
        System.out.println(result);
    }
    public static int sumBase(int n, int k) {
        int result = 0;
        while (n != 0){
            result += n % k;

            n = n /k;
        }
        return result;
    }
}
