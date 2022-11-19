import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays1 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> intersect = new HashSet<>();
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }else {
                intersect.add(nums1[i]);
                i++;
                j++;
            }
        }

        for (int num: intersect ){
            nums1[k++] = num;
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }


    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
