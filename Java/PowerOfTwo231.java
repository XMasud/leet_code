public class PowerOfTwo231 {
    public static boolean isPowerOfTwo(int n) {

        if(n == 1)
            return true;
        if(n == 0 || n < 0)
            return false;
        boolean result = true;
        while (n > 1){
            if(n%2 != 0){
                return false;
            }else {
                n = n /2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 14;
        boolean result = isPowerOfTwo(num);
        System.out.println(result);
    }
}
