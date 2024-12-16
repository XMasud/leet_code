import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays2215 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        List<List<Integer>> result = findDifference(nums1, nums2);
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        if (nums1.length < 1 || nums2.length < 1) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int val : nums1) {
            set1.add(val);
        }

        for (int val : nums2) {
            set2.add(val);
        }

        for (int val : set1) {
            if (!set2.contains(val)) {
                arr1.add(val);
            }
        }

        for (int val : set2) {
            if (!set1.contains(val)) {
                arr2.add(val);
            }
        }

        result.add(arr1);
        result.add(arr2);

        return result;
    }
}
