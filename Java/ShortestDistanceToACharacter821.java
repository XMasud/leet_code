import java.util.Arrays;
import java.util.HashSet;

public class ShortestDistanceToACharacter821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s,c);
        System.out.println(Arrays.toString(result));
    }
    public static int[] shortestToChar(String s, char c) {

        if(s.isEmpty())
            return new int[]{};

        int[] result = new int[s.length()];

        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                map.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                result[i] = 0;
            }else {
                int min = Integer.MAX_VALUE;
                for (int n: map){
                   min = Math.min(min,Math.abs(n-i));
                }
                result[i] = min;
            }
        }

        return result;
    }
}
