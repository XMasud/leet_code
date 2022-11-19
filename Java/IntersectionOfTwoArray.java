import java.util.Arrays;
public class IntersectionOfTwoArray {

    public static int[] intersect(int[] nums1, int[] nums2){

        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i< nums1.length && j < nums1.length){
            if(nums1[i] > nums2[j]){
                j++;
            } else if (nums1[i]< nums2[j]) {
                i++;
            }else {
                nums1[k++] = nums1[i];
                j++;
                i++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
