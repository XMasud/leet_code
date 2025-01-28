public class RemoveDuplicateFromSortedArray80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;

        int last_value = -1;
        int value_count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(last_value != nums[i]){
                last_value = nums[i];
                value_count = 1;
                index++;
            }else {
                value_count++;
                if(value_count <= 2)
                    index++;
            }
        }

        return index;
    }
}
