import java.util.Arrays;

public class MergeSortedArray88 {

    public static void merge(int[] nums1, int[] nums2, int m, int n) {

        if ((nums1.length == 0) || (nums1.length == nums2.length))
            for(int i=0;i< nums1.length;i++){
                nums1[i] = nums2[i];
            }

        int j=0;

        for(int i=0;i< nums1.length;i++){

            if(nums1[i]==0 && j < nums2.length){
                nums1[i] = nums2[j];
                j++;
            }
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;

        merge(nums1, nums2, m, n);

        System.out.println(Arrays.toString(nums1));
    }
}
