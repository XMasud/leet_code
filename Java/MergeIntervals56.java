import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{4,6}};
        int[][] result = merge(intervals);

    }
    public static int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));


        int previousStart = intervals[0][0];
        int previousEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int newStart = 0;
            int newEnd = 0;

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart < previousEnd){
                newStart = previousStart;
            }else{
                newStart = currentStart;
            }

            newEnd = Math.max(currentEnd, previousEnd);

            result.add(new int[]{newStart, newEnd});
        }

        System.out.println(Arrays.deepToString(result.toArray(new int[0][])));

        return result.toArray(new int[result.size()][]);
    }
}
