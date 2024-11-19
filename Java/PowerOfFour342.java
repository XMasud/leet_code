public class PowerOfFour342 {
    public static boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if(n == 0 || n < 0)
            return false;
        boolean result = true;
        while (n > 1){
            if(n%4 != 0){
                return false;
            }else {
                n = n /4;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 27;
        boolean result = isPowerOfFour(num);
    }
}
