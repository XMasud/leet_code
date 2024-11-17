import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference1200 {

    private static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(Math.abs(arr[i] - arr[i-1]), diff);
        }

        System.out.println(diff);

        int i = 0;
        while (i <= arr.length - 2){
            List<Integer> value = new ArrayList<>();
            if(Math.abs(arr[i] - arr[i+1]) == diff){
                value.add(arr[i]);
                value.add(arr[i+1]);
                result.add(value);
            }

            i = i + 1;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {188,9,-189,-112,165,4,-141,179,-154,258,53,71,201,204,121,215,259,-22,34,-213,-88,-192,118,-221,130,-86,209};
        List<List<Integer>> result = minimumAbsDifference(nums);
    }


}
