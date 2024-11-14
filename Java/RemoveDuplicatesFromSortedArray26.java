import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray26 {

    public static int removeDuplicates(int[] nums) {

        int index = 1;

        for (int i = 0; i < nums.length -1; i++) {
            if(nums[i] != nums[i+1]){
                nums[index] = nums[i+1];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[]  nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);

    }
}
