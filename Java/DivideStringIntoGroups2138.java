import java.util.ArrayList;
import java.util.Arrays;

public class DivideStringIntoGroups2138 {
    public static void main(String[] args) {
        String[] result = divideString("abcdefgi",3, 'x');
        System.out.println(Arrays.toString(result));
    }
    public static String[] divideString(String s, int k, char fill) {

        ArrayList<String> result = new ArrayList<>();
        int index = 0;

        while (index < s.length()){

            int end = Math.min(index+k, s.length());
            StringBuilder str = new StringBuilder(s.substring(index,end));

            while(str.length() < k)
                str.append(fill);

            result.add(str.toString());
            index += k;
        }
        return result.toArray(new String[0]);
    }
}
