import java.util.Arrays;

public class DIStringMatch942 {
    public static void main(String[] args) {
        String s = "IDID";
        int[] result = diStringMatch(s);
        System.out.println(Arrays.toString(result));
    }
    public static int[] diStringMatch(String s) {

        int left = 0, right = s.length(), size = s.length();
        int[] res = new int[s.length()+1];

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I'){
                res[i] = left++;
            }else
                res[i] = right--;
        }

        res[size] = right;

        return res;
    }
}
