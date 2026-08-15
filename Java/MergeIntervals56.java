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

        if (intervals.length <= 1)
                return intervals;

        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int[] newInterval = intervals[0];
        result.add(newInterval);


        for (int[] interval: intervals){

            if(interval[0] < newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }else {
                newInterval = interval;
                result.add(interval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
