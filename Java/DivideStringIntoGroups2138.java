import java.util.ArrayList;
import java.util.Arrays;

public class DivideStringIntoGroups2138 {
    public static void main(String[] args) {
        String[] result = divideString("abcdefghij",3, 'x');
    }
    public static String[] divideString(String s, int k, char fill) {

        ArrayList<String> result = new ArrayList<>();
        int n = (s.length() - 1)/ k;

        for (int i = 0; i < n; i++) {
            StringBuilder newStr = new StringBuilder();
            int j = 0;
            if(s.length() - i >= k-1){
                while (j < k){
                    newStr.append(s.charAt(i+j));
                    j++;
                }
            }else{
                int diff = s.length() - i;
            }
            result.add(newStr.toString());
        }


        return result.toArray(new String[0]);
    }
}
