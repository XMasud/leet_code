public class PerfectNumber507 {
    public static boolean checkPerfectNumber(int num) {

        if (num == 1) return false;

        int count = 1;

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                count = count + i;
            }
        }
        if(count == num)
            return true;

        return false;
    }
    public static void main(String[] args) {
        int num = 7;
        boolean result = checkPerfectNumber(num);
        System.out.println(result);
    }
}
