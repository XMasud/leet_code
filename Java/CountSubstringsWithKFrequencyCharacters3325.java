import java.util.HashMap;

public class CountSubstringsWithKFrequencyCharacters3325 {
    public static void main(String[] args) {
        String s = "abcde";
        int k = 1;
        int result = numberOfSubstrings(s, k);
        System.out.println(result);
    }

    public static int numberOfSubstrings(String s, int k) {

        int count = 0;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                if(isFrequencyString(s.substring(i,j),k))
                    count++;
            }
        }
        return count;
    }

    public static boolean isFrequencyString(String s, int k){

        HashMap<Character, Integer> maps = new HashMap<>();
        char[] res = s.toCharArray();

        for (char c: res){
            maps.put(c, maps.getOrDefault(c, 0) + 1);
            if(maps.get(c) >= k)
                return true;
        }
        return false;
    }
}
