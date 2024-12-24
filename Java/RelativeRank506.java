import java.util.Arrays;
import java.util.HashMap;

public class RelativeRank506 {
    public static void main(String[] args) {
        int[] scores = {10,3,8,9,4};
        String[] result = findRelativeRanks(scores);
        for (String str : result) {
            System.out.println(str);
        }
    }

    private static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        HashMap<Integer, Integer> scoreMap = new HashMap<>();

        int index = 0;
        for (int s : score) {
            scoreMap.put(s, index);
            index++;
        }

        Arrays.sort(score);

        int count = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            String rank = "";
            if (count == 0) {
                rank = "Gold Medal";
            } else if (count == 1) {
                rank = "Silver Medal";
            } else if (count == 2) {
                rank = "Bronze Medal";
            } else {
                rank = String.valueOf((count + 1));
            }

            result[scoreMap.get(score[i])] = rank;
            count++;
        }

        return result;
    }
}
