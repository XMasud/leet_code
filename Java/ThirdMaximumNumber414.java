import java.util.Arrays;
import java.util.HashSet;

import static java.util.Collections.list;

public class ThirdMaximumNumber414 {
    public static int thirdMax(int[] nums) {

        HashSet<Integer> list = new HashSet<>();

        for (int num : nums) {
            list.add(num);
        }

        int[] newArr = new int[list.size()];
        int i = 0;

        for (int num : list) {
            newArr[i] = num;
            i++;
        }
        Arrays.sort(nums);

        if (newArr.length < 3)
            return newArr[newArr.length - 1];

        return newArr[newArr.length - 3];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        int result = thirdMax(nums);
        System.out.println(result);
    }
}
