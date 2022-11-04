import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {

    public static int[] intersect(int[] nums1, int[] nums2){

        if(nums1.length < nums2.length)
            return intersect(nums2, nums1);

        ArrayList<Integer> numArr1 = new ArrayList<>();
        ArrayList<Integer> numArr2 = new ArrayList<>();


        for(int i=0; i<nums1.length; i++){
            numArr1.add(nums1[i]);
        }

        for (int i=0; i<nums2.length; i++){
            if(numArr1.contains(nums2[i])){
                numArr2.add(nums2[i]);
            }
        }

        int[] result = new int[numArr2.size()];

        for (int i=0; i<numArr2.size(); i++){
            result[i] = numArr2.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
