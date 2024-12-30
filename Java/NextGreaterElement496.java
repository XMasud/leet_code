import java.util.HashMap;

public class NextGreaterElement496 {
    public static void main(String[] args) {
        int[] num1 = {2,4};
        int[] num2 = {1, 2, 3, 4};
        int[] result = nextGreaterElement(num1, num2);
        for (int n : result) {
            System.out.println(n);
        }
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> record = new HashMap<>();

        if(nums1.length < 1 || nums2.length < 1)
            return result;

        for (int i = 0; i < nums2.length; i++) {
            record.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {

            int index = record.get(nums1[i]);

            if (index >= 0) {

                index++;
                boolean flag = false;
                while (index < nums2.length) {
                    if (nums2[index] > nums1[i]) {
                        result[i] = nums2[index];
                        flag = true;
                        break;
                    }
                    index++;
                }
                if (!flag)
                    result[i] = -1;
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
