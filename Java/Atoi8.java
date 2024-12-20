public class Atoi8 {
    public static void main(String[] args) {
        String s = " ";
        int result = myAtoi(s);
        System.out.println(result);
    }

    private static int myAtoi(String s) {

        if (s == null)
            return 0;

        int index = 0;
        s = s.trim();

        if (s.isEmpty()) return 0;

        int sign = 1;
        long result = 0;

        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }


        while (index < s.length()) {

            if (s.charAt(index) == ' ' || !Character.isDigit(s.charAt(index))) break;

            result = result * 10 + s.charAt(index) - '0';

            if ((sign == -1) && (-1 * result < MIN)) return MIN;
            if ((sign == 1) && (result > MAX)) return MAX;

            index++;
        }


        return (int) (sign * result);
    }
}
