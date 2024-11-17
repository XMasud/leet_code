public class CalculateDigitSumOfaString2243 {
    public static String digitSum(String s, int k) {
        int n = 0;

        while (n < 100){
            int result = Integer.parseInt(s)%100;
            System.out.println(result);
             n = result/100;
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "11111222223";
        String result = digitSum(s, 3);
    }
}
