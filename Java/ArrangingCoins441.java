public class ArrangingCoins441 {
    public static int arrangeCoins(int n) {

        long count = 0;
        int index = 0;
        long sum = 0;
        while(n >= sum ){

            count++;
            sum = sum + count;
            if(sum <= n){
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int num = 8;
        int result = arrangeCoins(num);
        System.out.println(result);
    }
}
