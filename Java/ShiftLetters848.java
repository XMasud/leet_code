import java.util.Arrays;

public class ShiftLetters848 {
    public static void main(String[] args) {
        String s = "aaa";
        int[] shifts = {1,2,3};
        String result = shiftingLetters(s, shifts);
        System.out.println(result);
    }

    private static String shiftingLettersBruteForce(String s, int[] shifts) {

        char[] res = s.toCharArray();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count < shifts.length) {

                int rotate = shifts[count];
                int index = 0;

                while (index <= i) {
                    char c = (char) ((res[index] - 'a' + rotate) % 26 + 'a');
                    res[index] = c;
                    index++;
                }
            }
            count++;
        }

        return String.valueOf(res);
    }
   private static String shiftingLetters(String s, int[] shifts) {

       char[] res = s.toCharArray();
       int count = shifts.length - 1;

       long index = 0;
       for (int i = res.length -1; i >= 0; i--) {
           int rotate = shifts[count];
           char c = (char) ((char) ((res[i] - 'a' + rotate + index) % 26) + 'a');
           index = index + rotate;
           res[i] = c;
           count--;
       }

       return String.valueOf(res);
   }
}
