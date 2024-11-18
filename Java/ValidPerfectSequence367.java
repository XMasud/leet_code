public class ValidPerfectSequence367 {

    public static boolean isPerfectSquare(int num) {
        boolean res = false;

       double n = Math.sqrt(num);
        if(n == (int) n)
            res = true;

        return res;
    }
    public static void main(String[] args) {

        int num = 14;
        boolean result = isPerfectSquare(num);
        System.out.println(result);

    }
}
