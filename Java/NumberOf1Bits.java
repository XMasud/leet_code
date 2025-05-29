public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 11;
        int result = hammingWeight(n);
    }

    private static int hammingWeight(int n) {

        String binaryString = Integer.toBinaryString(n);
        int count = 0;

        for (char c: binaryString.toCharArray()){
            if(c == '1')
                count++;
        }

        return Integer.bitCount(n);
    }
}
