public class Fibonacci {

    public static int findFibonacci(int num){

        if(num <= 1)
            return num;

        int a = 0;
        int b = 1;
        int sum = a + b;
        while (num > 1){
            sum = a + b;
            a = b;
            b = sum;

            num --;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 7;
        int result = findFibonacci(num);
        System.out.println(result);
    }
}
