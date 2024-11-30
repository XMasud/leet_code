public class DivisorGame1025 {
    public static void main(String[] args) {
        boolean result = divisorGame(2);
        System.out.println(result);
    }
    public static boolean divisorGame(int n) {

        return n % 2 == 0;
    }
}
