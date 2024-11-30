public class TribonacciNumber1137 {
    public static void main(String[] args) {
        int result = tribonacci(25);
        System.out.println(result);
    }
    public static int tribonacci(int n) {

        if (n == 0){
            return 0;
        }else if(n < 3){
            return 1;
        }

        int t_0 = 0;
        int t_1 = 1;
        int t_2 = 1;
        int sum = t_0 + t_1 + t_2;

        while (n >= 3){

            sum = t_0 + t_1 + t_2;

            t_0 = t_1;
            t_1 = t_2;
            t_2 = sum;

            n--;
        }

        return sum;
    }
}
