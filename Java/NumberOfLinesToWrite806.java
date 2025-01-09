import java.util.Arrays;
import java.util.HashMap;

public class NumberOfLinesToWrite806 {
    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] result = numberOfLines(widths,"abcdefghijklmnopqrstuvwxyz");
        System.out.println(Arrays.toString(result));
    }

    private static int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];

        HashMap<Character, Integer> letters = new HashMap<>();

        int letter_start = 97;
        for (int i = 0; i < 26; i++) {
            char c = (char) letter_start;
            letters.put(c,i);
            letter_start++;
        }

        int line_count = 0;
        int pixel_count = 0;

        for (char c: s.toCharArray()){
            if(letters.containsKey(c)){
                int value = letters.get(c);
                if(pixel_count + widths[value] > 100){
                    line_count++;
                    pixel_count =  widths[value];
                }else {
                    pixel_count = pixel_count + widths[value];
                }
            }
        }

        if(pixel_count > 0){
            line_count++;
        }

        result[0] = line_count;
        result[1] = pixel_count;

        return result;
    }


}
