import java.util.Arrays;

public class FindDistanceValueBetweenTwoArrays1385 {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int result = findTheDistanceValue(arr1,arr2,2);
        System.out.println(result);
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);

        for (int num: arr1){
            if (isDistanceBetweenD(arr2,num,d))
                count++;
        }
        return count;
    }
    public static boolean isDistanceBetweenD(int[] arr2, int element, int d){

        int low = 0, high = arr2.length - 1;

        while (low <= high){
            int mid = (low + high) /2;

            if(Math.abs(element - arr2[mid]) <= d){
                return false;
            } else if (arr2[mid] < element) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return true;
    }

}
