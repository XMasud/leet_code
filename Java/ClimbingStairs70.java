public class ClimbingStairs70 {
    public static int climbStairs(int n) {

        if (n <= 3)
            return n;

        int a = 0;
        int b = 1;
        int sum = 0;

        while (n> 0){
            sum = a + b;
            a = b;
            b = sum;

            n--;
        }

        return sum;
    }
    public static void main(String[] args) {
        int number = 4;
        int result = climbStairs(number);
        System.out.println(result);
    }
}
