public class DivisibleNondivisibleSumsDifference2894 {
    public static void main(String[] args) {
        int n = 10, m = 3;
        int result = differenceOfSums(n,m);
    }
    public static int differenceOfSums(int n, int m) {
        int divisibleSum = 0;
        int nonDivisibleSum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % m == 0){
                divisibleSum += i;
            }else {
                nonDivisibleSum += i;
            }
        }

        return nonDivisibleSum - divisibleSum;
    }
}
