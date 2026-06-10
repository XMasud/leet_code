import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

    }
    public static int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currentStart < nextStart){

                result.add(new int[] {currentStart, currentEnd});

                currentStart = nextStart;
                currentEnd = nextEnd;
            }else {
                currentEnd = Math.max(currentEnd, nextEnd);
            }
        }

        result.add(new int[] {currentStart, currentEnd});

        System.out.println(result);
        
        return result.toArray(new int[result.size()][]);
    }
}
