import java.util.Arrays;

public class RemoveDuplicateFromSortedArray80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;

        for (int num: nums){
            if(index < 2 || num != nums[index - 2]){
                nums[index] = num;
                index++;
            }
        }

        return index;
    }

}
