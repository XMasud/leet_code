import java.util.Arrays;

public class NumberOfLinesToWrite806 {
    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] result = numberOfLines(widths, "bbbcccdddaaa");
        System.out.println(Arrays.toString(result));
    }

    private static int[] numberOfLines(int[] widths, String s) {

        int line_count = 1;
        int pixel_count = 0;

        for (char c : s.toCharArray()) {

            int value = widths[c - 'a'];
            if (pixel_count + value > 100) {
                line_count++;
                pixel_count = value;
            } else {
                pixel_count = pixel_count + value;
            }
        }

        return new int[]{line_count, pixel_count};
    }
}
