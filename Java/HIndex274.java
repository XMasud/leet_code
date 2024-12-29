import java.util.Arrays;

public class HIndex274 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int result = hIndex(citations);
        System.out.println(result);
    }

    private static int hIndex(int[] citations) {

        int[] result = new int[citations.length + 1];

        for (int citation : citations) {
            if (citation > citations.length) {
                result[citations.length]++;
            } else {
                result[citation]++;
            }
        }

        int count = 0;
        for (int i = citations.length; i >= 0; i--) {
            count = count + result[i];
            if (count >= i) {
                return i;
            }
        }

        return 0;
    }
}
