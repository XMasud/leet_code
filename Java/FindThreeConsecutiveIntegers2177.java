public class FindThreeConsecutiveIntegers2177 {
    public static void main(String[] args) {
        int num = 33;
        long[] result = sumOfThree(num);
    }
    public static long[] sumOfThree(long num) {

        long[] result = new long[3];

        if(num == 0){
            result[0] = -1;
            result[2] = 1;
            return result;
        }

        if(num % 3 == 0){
            result[0] = (num / 3) - 1;
            result[1] = (num / 3);
            result[2] = (num / 3) + 1;
            return result;
        }else {
            return new long[0];
        }
    }
}
