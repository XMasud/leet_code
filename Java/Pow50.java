public class Pow50 {

    public static double myPow(double x, int n) {

        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        double result = myPow(x, n);
        System.out.println(result);
    }
}
