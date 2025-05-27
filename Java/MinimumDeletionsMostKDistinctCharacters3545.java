import java.util.*;

public class MinimumDeletionsMostKDistinctCharacters3545 {
    public static void main(String[] args) {
        String s = "yyyzz";
        int k = 2;
        int result = minDeletion(s,k);
        System.out.println(result);
    }
    public static int minDeletion(String s, int k) {

        int count = 0;
        HashMap<Character,Integer> result = new HashMap<>();

        for (char c: s.toCharArray()){
            result.put(c,result.getOrDefault(c,0)+1);
        }

        if (result.size() <= k) return 0;

        List<Integer> frequencies = new ArrayList<>(result.values());
        Collections.sort(frequencies);

        int del = result.size() - k;

        for (int j = 0; j < del; j++) {
            count = count + frequencies.get(j);
        }
        return count;
    }
}
