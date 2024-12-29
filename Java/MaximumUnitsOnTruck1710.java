import java.util.Arrays;

public class MaximumUnitsOnTruck1710 {
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10}, {2, 5}, {4, 7},{3,9}};
        int result = maximumUnits(boxTypes, 10);
        System.out.println(result);
    }

    private static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int maxCount = 0;
        int boxCount = 0;

        for (int[] boxType : boxTypes) {

            if ((boxCount + boxType[0]) < truckSize) {
                maxCount = maxCount + (boxType[0] * boxType[1]);
                boxCount = boxCount + boxType[0];

            } else {
                int diff = truckSize - (boxCount);
                maxCount = maxCount + (diff * boxType[1]);
                break;
            }
        }

        return maxCount;
    }
}
