import java.util.Arrays;

public class HeightChecker1051 {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        int result = heightChecker(heights);
        System.out.println(result);
    }

    private static int heightChecker(int[] heights) {

        int misplacedCount = 0;

        int[] ascOrderArr = heights.clone();
        Arrays.sort(heights);

        for (int i = 0; i < ascOrderArr.length; i++) {
            if(ascOrderArr[i] != heights[i])
                misplacedCount++;
        }

        return misplacedCount;
    }
}
