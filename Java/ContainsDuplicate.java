import java.util.ArrayList;
import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean status = false;
        Arrays.sort(nums);

        for (int i=0; i< nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }

        return status;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean status = containsDuplicate(nums);
        System.out.println(status);
    }
}
