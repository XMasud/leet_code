import java.util.HashSet;

public class HappyNumber202 {

    public static boolean isHappy(int n) {

        HashSet<Integer> numbers = new HashSet<>();

        while (true){
            int sum = 0;
            while (n > 0){
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
            }

            if (sum == 1)
                return true;

            n = sum;

            if (numbers.contains(sum))
                return false;
            numbers.add(sum);
        }
    }

    public static void main(String[] args) {
        int number = 19;
        boolean result = isHappy(number);
        System.out.println(result);
    }
}
