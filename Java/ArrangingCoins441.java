public class ArrangingCoins441 {
    public static int arrangeCoins(int n) {

        long left = 1, right = (long) n;

        while (left <= right){
            long mid = left + (right - left) / 2;
            if((mid * (mid+1) / 2) == n){
                return (int) mid;
            } else if ((mid * (mid+1) / 2) > n) {
                right = mid - 1;
            } else if ((mid * (mid+1) / 2) < n) {
                left = mid + 1;
            }
        }

        return (int) left - 1;
    }
    public static void main(String[] args) {
        int num = 5;
        int result = arrangeCoins(num);
        System.out.println(result);
    }
}
