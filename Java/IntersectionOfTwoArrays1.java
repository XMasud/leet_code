import java.util.Arrays;

public class IntersectionOfTwoArrays1 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length){

        }

        return nums1;
    }


    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
