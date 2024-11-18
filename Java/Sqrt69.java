public class Sqrt69 {

    public static int mySqrt(int x) {

        return (int) Math.floor(Math.sqrt(x));
    }

    public static void main(String[] args) {
        int number = 8;
        int result = mySqrt(number);
        System.out.println(result);
    }
}
