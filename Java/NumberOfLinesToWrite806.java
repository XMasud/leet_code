import java.util.Arrays;
import java.util.HashMap;

public class NumberOfLinesToWrite806 {
    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] result = numberOfLines(widths, "bbbcccdddaaa");
        System.out.println(Arrays.toString(result));
    }

    private static int[] numberOfLines(int[] widths, String s) {

        int[] result = new int[2];

        int line_count = 0;
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

        if (pixel_count > 0) {
            line_count++;
        }

        result[0] = line_count;
        result[1] = pixel_count;

        return result;
    }


}
