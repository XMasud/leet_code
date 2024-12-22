public class LemonadeChange860 {
    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 10, 20};
        boolean result = lemonadeChange(bills);
        System.out.println(result);
    }

    private static boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (Integer num : bills) {
            if(num == 5){
                five++;
            } else if (num == 10) {
                ten++;
                five--;
            } else if (ten > 0) {
                ten--;
                five--;
            }else {
                five -= 3;
            }
            if(five < 0)
                return false;
        }
        return true;
    }
}
