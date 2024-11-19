public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {

        if(n == 0 || n < 0)
            return false;
        boolean result = true;
        while (n > 1){
            if(n%3 != 0){
                return false;
            }else {
                n = n /3;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 27;
        boolean result = isPowerOfThree(num);
    }
}
